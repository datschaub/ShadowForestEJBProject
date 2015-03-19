package shadowforest.eao.ics;

import javax.ejb.Local;

import shadowforest.ejb.ics.Character;

@Local
public interface CharacterEAOImplLocal {
	public Character findByCharacterId(String charId);
	public Character createCharacter(Character charvar);
	public Character updateCharacter(Character charvar);
	public void deleteCharacter(String charId);
}
