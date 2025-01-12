package back.eva.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class PlayerTotalScore {
	
	@Id
	private Long id;
	
	private String username;

	private String killDeathRatio;
	
	public String getUsername() {
		return username;
	}
	
	public String getKillDeathRatio() {
		return killDeathRatio;
	}
}
