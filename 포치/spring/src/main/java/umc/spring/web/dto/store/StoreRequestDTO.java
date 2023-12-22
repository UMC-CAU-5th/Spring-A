package umc.spring.web.dto.store;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class StoreRequestDTO {

    @Getter
    public static class AddStoreDTO{
        @NotNull
        String name;
        @NotNull
        String address;
        @NotNull
        Long regionId;
    }
}
