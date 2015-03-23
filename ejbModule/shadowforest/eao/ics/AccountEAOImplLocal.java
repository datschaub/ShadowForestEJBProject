package shadowforest.eao.ics;

import java.util.UUID;

import javax.ejb.Local;

import shadowforest.ejb.ics.Account;

@Local
public interface AccountEAOImplLocal {
	public Account findByAccountId(String accId);
	public Account createAccount(Account acc);
	public Account updateAccount(Account acc);
	public void deleteAccount(String id);
	public Account findByAccountName(String accName);

}
