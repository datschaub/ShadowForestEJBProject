package shadowforest.ejb.ics;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Character")
public class Character implements Serializable{

	private String charId;
	private String charName;
	private int exp;
	
	@Id
	@Column(name="CharacterId")
	public String getCharId() {
		return charId;
	}
	
	public void setCharId(String charId) {
		this.charId = charId;
	}
	
	@Column(name="CharacterName")
	public String getCharName() {
		return charName;
	}
	
	public void setCharName(String charName) {
		this.charName = charName;
	}
	
	@Column(name="Exp")
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
}
