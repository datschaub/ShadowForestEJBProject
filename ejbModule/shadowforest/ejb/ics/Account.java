package shadowforest.ejb.ics;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Account.findByAccountName", query="SELECT a FROM Account a WHERE a.accName LIKE :accName")
@Table(name="Account")
public class Account implements Serializable{
	
	private String accId;
	private String accName;
	private String password;
	private Set<Character> characters;
	
	public Account(){
		
	}
	
	public Account(String accName, String password){
		this.accName = accName;
		this.password = password;
	}
	
	@Id
	@Column(name="AccId")
	public String getAccId() {
		return accId;
	}
	
	public void setAccId(String accId) {
		this.accId = accId;
	}
	
	@Column(name="AccName")
	public String getAccName() {
		return accName;
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	@Column(name="Password")
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany(mappedBy="account", fetch=FetchType.EAGER)
	public Set<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(Set<Character> characters) {
		this.characters = characters;
	}
	
	@Override
	public boolean equals(Object obj){

		Account tempAcc = (Account)obj;
		return tempAcc.getAccName().equals(this.accName) 
				&& tempAcc.getPassword().equals(this.password);
	}

}
