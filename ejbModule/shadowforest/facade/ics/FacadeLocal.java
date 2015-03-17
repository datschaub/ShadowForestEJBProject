package shadowforest.facade.ics;

import java.util.UUID;

import javax.ejb.Local;

import shadowforest.ejb.ics.Account;

@Local
public interface FacadeLocal {
	public Account findByAccountId(String accId);
	public Account createAccount(Account account);
	public Account updateAccount(Account account);
	public void deleteAccount(String accId);

}
