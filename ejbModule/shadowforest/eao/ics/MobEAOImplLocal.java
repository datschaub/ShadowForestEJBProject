package shadowforest.eao.ics;

import java.util.UUID;

import javax.ejb.Local;

import shadowforest.ejb.ics.Mob;

@Local
public interface MobEAOImplLocal {
	public Mob findByMobId(String id);
	public Mob createMob(Mob mob);
	public Mob updateMob(Mob mob);
	public void deleteMob(String id);

}
