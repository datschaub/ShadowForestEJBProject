package shadowforest.eao.ics;

import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import shadowforest.ejb.ics.Account;

/**
 * Session Bean implementation class AccountEAOImpl
 */

@Stateless
public class AccountEAOImpl implements AccountEAOImplLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public AccountEAOImpl() {

	}

	public Account findByAccountId(String accId) {
		return em.find(Account.class, accId);
	}

	public Account createAccount(Account account) {
		em.persist(account);
		return account;
	}

	public Account updateAccount(Account account) {
		em.merge(account);
		return account;
	}

	public void deleteAccount(String accId) {
		Account a = this.findByAccountId(accId);
		if (a != null) {
			em.remove(a);
		}
	}
	
	public Account findByAccountName(String accName){
		TypedQuery<Account> query = em.createNamedQuery("Account.findByAccountName", Account.class);
		
		query.setParameter("accName", accName);
		
		List<Account> accList = query.getResultList();
		
		if(accList.size() == 1)
			return accList.get(0);
		
		return null;
	}

}
