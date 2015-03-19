package shadowforest.facade.ics;

import java.util.UUID;

import javax.ejb.Local;

import shadowforest.ejb.ics.Account;
import shadowforest.ejb.ics.Character;

@Local
public interface FacadeLocal {
	public Account findByAccountId(String accId);
	public Account createAccount(Account account);
	public Account updateAccount(Account account);
	public void deleteAccount(String accId);
	
	public Character findByCharacterId(String charId);
	public Character createCharacter(Character charvar);
	public Character updateCharacter(Character charvar);
	public void deleteCharacter(String charId);

}
