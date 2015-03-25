package shadowforest.ejb.ics;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Character")
public class Character implements Serializable{

	private String charId;
	private String charName;
	private int exp;
	private int currentHp;
	private int maxHp;
	private int baseDmgMin;
	private int baseDmgMax;
	private int gold;
	private Account account;

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
	@Column(name="CurrentHp")
	public int getCurrentHp(){
		return currentHp;
	}
	
	public void setCurrentHp(int currentHp){
		this.currentHp = currentHp;
	}
	
	@Column(name="MaxHp")
		public int getMaxHp(){
			return maxHp;
		}
	public void setMaxHp(int maxHp){
		this.maxHp = maxHp;
	}
	
	@Column(name="BaseDmgMin")
	public int getBaseDmgMin(){
		return baseDmgMin;
	}
	public void setBaseDmgMin(int baseDmgMin){
		this.baseDmgMin = baseDmgMin;
	}
	
	@Column(name="BaseDmgMax")
	public int getBaseDmgMax(){
		return baseDmgMax;
	}
	public void setBaseDmgMax(int baseDmgMax){
		this.baseDmgMax = baseDmgMax;
	}
	
	@Column(name="Gold")
	public int getGold(){
		return gold;
	}
	public void setGold(int gold){
		this.gold = gold;
	}
	
	
	@ManyToOne
	@JoinColumn(name="AccId", referencedColumnName="AccId")
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
