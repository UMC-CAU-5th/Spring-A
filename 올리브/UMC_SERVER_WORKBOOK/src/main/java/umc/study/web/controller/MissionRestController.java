package umc.study.web.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import umc.study.apiPayload.ApiResponse;
import umc.study.domain.Mission;
import umc.study.web.dto.MissionResponseDTO.JoinResultDTO;




@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/mission")
public class MissionRestController {

    @GetMapping()
    public ApiResponse<JoinResultDTO> get(
            @RequestParam(required = true, defaultValue = "1") Integer memberId) {
        List<Mission> missions = missionService.getMissions();
        return ApiResponse.onSuccess(MissionConver.toMissionResultDTO(missions));
    }
}
