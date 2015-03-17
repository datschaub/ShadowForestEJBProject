package shadowforest.facade.ics;

import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import shadowforest.eao.ics.MobEAOImplLocal;
import shadowforest.ejb.ics.Mob;

@Stateless
public class Facade implements FacadeLocal {

	@EJB
	private MobEAOImplLocal mobEAO;
	
    public Facade() {

    }
    
    public Mob findByMobId(String id){
    	return mobEAO.findByMobId(id);
    }
    
    public Mob createMob(Mob mob){
    	return mobEAO.createMob(mob);
    }
    
    public Mob updateMob(Mob mob){
    	return mobEAO.updateMob(mob);
    }
    
    public void deleteMob(String id){
    	mobEAO.deleteMob(id);
    }

}
