package bank.service;
import bank.integration.EmailSender;


import java.util.Date;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.domain.Account;
import bank.domain.Customer;
import bank.domain.TraceRecord;
import bank.repositories.AccountRepository;
import bank.repositories.CustomerRepository;
import bank.repositories.TraceRecordRepository;

@Service
public class BankService {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private EmailSender emailSender;
	@Autowired
	private TraceRecordRepository traceRecordRepository;
	
	
	public void createCustomerAndAccount(int customerId, String customerName, String emailAddress, String AccountNumber){
		try {
			Account account = new Account(AccountNumber);
			accountRepository.save(account);
			Customer customer = new Customer(customerId, customerName);
	        customer.setAccount(account);
			customerRepository.saveCustomer(customer);
			emailSender.sendEmail(emailAddress, "Welcome "+customerName);
			traceRecordRepository.save(new TraceRecord(new Date(), "Customer "+customerName+" created with account " + AccountNumber));
		}catch(Exception e){
			emailSender.sendEmail(emailAddress,"We coould not create your account " + AccountNumber );
			traceRecordRepository.save(new TraceRecord(new Date(), "Could not create customer "+customerName+" with account "+ AccountNumber)); 
			throw (e);
		}
		
	}

}
