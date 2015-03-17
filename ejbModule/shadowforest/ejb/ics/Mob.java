package shadowforest.ejb.ics;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mob")
public class Mob implements Serializable{
	
	private String mobId;
	private String name;
	private int baseDmgMin;
	private int baseDmgMax;
	
	@Id
	@Column(name="MobId")
	public String getMobId() {
		return mobId;
	}
	
	public void setMobId(String mobId) {
		this.mobId = mobId;
	}
	
	@Column(name="Name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="BaseDmgMin")
	public int getBaseDmgMin() {
		return baseDmgMin;
	}
	
	public void setBaseDmgMin(int baseDmgMin) {
		this.baseDmgMin = baseDmgMin;
	}
	
	@Column(name="BaseDmgMax")
	public int getBaseDmgMax() {
		return baseDmgMax;
	}
	
	public void setBaseDmgMax(int baseDmgMax) {
		this.baseDmgMax = baseDmgMax;
	}

}
