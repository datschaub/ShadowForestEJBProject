package shadowforest.facade.ics;

import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import shadowforest.eao.ics.AccountEAOImplLocal;
import shadowforest.ejb.ics.Account;

@Stateless
public class Facade implements FacadeLocal {

	@EJB
	private AccountEAOImplLocal accEAO;
	
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

}
