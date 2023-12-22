package umc.spring.converter;

import umc.spring.domain.Mission;
import umc.spring.domain.Store;
import umc.spring.web.dto.mission.MissionRequestDTO;
import umc.spring.web.dto.mission.MissionResponseDTO;

import java.time.LocalDateTime;

public class MissionConverter {

    public static MissionResponseDTO.AddToStoreResult toStoreResult(Mission mission, Store store){
        return MissionResponseDTO.AddToStoreResult.builder()
                .missionId(mission.getId())
                .storeId(store.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Mission toMission(MissionRequestDTO.AddToStore request, Store store){
        return Mission.builder()
                .mission_spec(request.getMissionSpec())
                .reward(request.getReward())
                .deadline(request.getDeadline())
                .store(store)
                .build();
    }
}
