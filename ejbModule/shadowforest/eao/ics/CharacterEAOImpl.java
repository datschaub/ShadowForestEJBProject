package shadowforest.eao.ics;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import shadowforest.ejb.ics.Account;
import shadowforest.ejb.ics.Character;

public class CharacterEAOImpl implements CharacterEAOImplLocal {
	
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public Character findByCharacterId(String charId) {
		return em.find(Character.class, charId);
	}

	public Character createCharacter(Character charvar) {
		em.persist(charvar);
		return charvar;
	}

	public Character updateCharacter(Character charvar) {
		em.merge(charvar);
		return charvar;
	}

	public void deleteCharacter(String charId) {
		Character c = this.findByCharacterId(charId);
		if (c != null) {
			em.remove(c);
		}
	}
	
	

}
