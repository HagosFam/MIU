package bank.domain;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Customer {

	@Id
	private long id;
	private String name;
	
    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;
    
    
	protected Customer() {
	}



	public Customer(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}




}


