package shadowforest.eao.ics;

import java.util.UUID;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import shadowforest.ejb.ics.Mob;

/**
 * Session Bean implementation class MobEAOImpl
 */
@Stateless
public class MobEAOImpl implements MobEAOImplLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public MobEAOImpl() {

	}

	public Mob findByMobId(String id) {
		return em.find(Mob.class, id);
	}

	public Mob createMob(Mob mob) {
		em.persist(mob);
		return mob;
	}

	public Mob updateMob(Mob mob) {
		em.merge(mob);
		return mob;
	}

	public void deleteMob(String id) {
		Mob m = this.findByMobId(id);
		if (m != null) {
			em.remove(m);
		}
	}

}
