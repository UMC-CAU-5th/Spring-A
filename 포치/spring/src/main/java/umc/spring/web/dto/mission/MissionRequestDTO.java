package umc.spring.web.dto.mission;

import lombok.Getter;

import java.time.LocalDateTime;

public class MissionRequestDTO {

    @Getter
    public static class AddToStore{
        String reward;
        String missionSpec;
        LocalDateTime deadline;
        Long storeId;
    }
}
