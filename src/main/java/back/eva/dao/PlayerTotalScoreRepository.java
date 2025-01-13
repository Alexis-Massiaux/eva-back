package back.eva.dao;

import back.eva.model.PlayerTotalScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerTotalScoreRepository
		extends JpaRepository<PlayerTotalScore, Long> {
}
