package umc.spring.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.converter.MissionConverter;
import umc.spring.domain.Mission;
import umc.spring.domain.Store;
import umc.spring.service.missionService.MissionService;
import umc.spring.web.dto.mission.MissionRequestDTO;
import umc.spring.web.dto.mission.MissionResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mission")
public class MissionRestController {
    private final MissionService missionService;

    @PostMapping("/store")
    public ApiResponse<MissionResponseDTO.AddToStoreResult> addToStore(@RequestBody @Valid MissionRequestDTO.AddToStore request){
        Mission mission = missionService.addMissionToStore(request);
        return ApiResponse.onSuccess(MissionConverter.toStoreResult(mission, mission.getStore()));
    }
}
