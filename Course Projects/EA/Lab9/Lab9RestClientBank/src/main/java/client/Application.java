package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collection;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	BankGateway bankGateway;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//create 2 accounts;
		bankGateway.createAccount(1263862, "Frank Brown");
		bankGateway.createAccount(4253892, "John Doe");
		// use account 1;
		bankGateway.deposit(1263862, 240);
		bankGateway.deposit(1263862, 529);
		bankGateway.withdrawEuros(1263862, 230);
		// use account 2;
		bankGateway.deposit(4253892, 12450);
		bankGateway.depositEuros(4253892, 200);
		bankGateway.transferFunds(4253892, 1263862, 100, "payment of invoice 10232");
		// show balances

		Collection<AccountDTO> accountlist = bankGateway.getAllAccounts();
		CustomerDTO customer = null;
		for (AccountDTO account : accountlist) {
			customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountnumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.println(
					"-Date-------------------------" + "-Description------------------" + "-Amount-------------");
			for (AccountEntryDTO entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", entry.getDate().toString(), entry.getDescription(),
						entry.getAmount());
			}
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}
}
