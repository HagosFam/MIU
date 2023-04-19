package bank.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {

	@Id
	private int id;
	private String name;
	

    private Account account;
    
    
	protected Customer() {
	}



	public Customer(int id, String name) {
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


