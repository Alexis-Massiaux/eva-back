package back.eva.mapper;

import back.eva.dto.PlayerTotalScoreDto;
import back.eva.model.PlayerTotalScore;

public class PlayerTotalScoreMapper {
	
	private PlayerTotalScoreMapper() {
	}
	
	public static PlayerTotalScoreDto toDto( PlayerTotalScore playerTotalScore ) {
		
		return PlayerTotalScoreDto.builder()
				.username( playerTotalScore.getUsername() )
				.killDeathRatio( playerTotalScore.getKillDeathRatio() )
				.build();
	}
}

