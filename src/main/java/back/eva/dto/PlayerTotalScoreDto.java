package back.eva.dto;

import lombok.Builder;

@Builder
public record PlayerTotalScoreDto(String username, String killDeathRatio) {
}

