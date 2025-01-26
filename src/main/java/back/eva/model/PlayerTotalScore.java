package back.eva.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table( name = "player" )
public class PlayerTotalScore {
	
	@Id
	private Long id;
	
	private String username;
	
	private String killDeathRatio;
	
}

