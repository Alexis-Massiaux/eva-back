package back.eva.controller;

import back.eva.dto.PlayerTotalScoreDto;
import back.eva.mapper.PlayerTotalScoreMapper;
import back.eva.service.PlayerTotalScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping( value = "/player" )
public class PlayerController {
	
	private final PlayerTotalScoreService playerService;
	
	@GetMapping
	public List< PlayerTotalScoreDto > getPlayers() {
		
		return playerService.findAllPlayerTotalScore()
				.stream()
				.map( PlayerTotalScoreMapper::toDto )
				.toList();
	}
}

