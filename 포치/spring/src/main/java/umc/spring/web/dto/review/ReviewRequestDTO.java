package umc.spring.web.dto.review;

import lombok.Getter;

import java.util.List;

public class ReviewRequestDTO {
    @Getter
    public static class AddReviewDTO {
        private Long memberId;
        private String body;
        private Float score;
        private List<String> ImageList;
        private Long storeId;
    }
}
