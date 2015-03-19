package shadowforest.facade.ics;

import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import shadowforest.eao.ics.AccountEAOImplLocal;
import shadowforest.eao.ics.CharacterEAOImplLocal;
import shadowforest.ejb.ics.Account;
import shadowforest.ejb.ics.Character;

@Stateless
public class Facade implements FacadeLocal {

	@EJB
	private AccountEAOImplLocal accEAO;
	private CharacterEAOImplLocal charEAO;
	
    public Facade() {

    }
    
    public Account findByAccountId(String accId){
    	return accEAO.findByAccountId(accId);
    }
    
    public Account createAccount(Account account){
    	return accEAO.createAccount(account);
    }
    
    public Account updateAccount(Account account){
    	return accEAO.updateAccount(account);
    }
    
    public void deleteAccount(String accId){
    	accEAO.deleteAccount(accId);
    }
    
    public Character findByCharacterId(String charId){
    	return charEAO.findByCharacterId(charId);
    }
    
    public Character createCharacter(Character charvar){
    	return charEAO.createCharacter(charvar);
    }
    
    public Character updateCharacter(Character charvar){
    	return charEAO.updateCharacter(charvar);
    }
    
    public void deleteCharacter(String charId){
    	charEAO.deleteCharacter(charId);
    }

}
