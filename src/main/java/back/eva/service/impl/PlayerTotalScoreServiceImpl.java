package back.eva.service.impl;

import back.eva.dao.PlayerTotalScoreRepository;
import back.eva.model.PlayerTotalScore;
import back.eva.service.PlayerTotalScoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerTotalScoreServiceImpl implements PlayerTotalScoreService {
	
	private final PlayerTotalScoreRepository playerTotalScoreRepository;
	
	public PlayerTotalScoreServiceImpl( PlayerTotalScoreRepository playerTotalScoreRepository) {
		this.playerTotalScoreRepository = playerTotalScoreRepository;
	}
	
	
	@Override
	public List<PlayerTotalScore> findAllPlayerTotalScore() {
		return playerTotalScoreRepository.findAll();
	}
}
