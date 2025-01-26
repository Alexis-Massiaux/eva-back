package back.eva.mapper;

import back.eva.dto.PlayerTotalScoreDto;
import back.eva.model.PlayerTotalScore;

public class PlayerTotalScoreMapper {
	
	private PlayerTotalScoreMapper() {
	}
	
	public static PlayerTotalScoreDto toDto( PlayerTotalScore playerTotalScore ) {
		
		return new PlayerTotalScoreDto(
				playerTotalScore.getUsername(),
				playerTotalScore.getKillDeathRatio() );
	}
}
