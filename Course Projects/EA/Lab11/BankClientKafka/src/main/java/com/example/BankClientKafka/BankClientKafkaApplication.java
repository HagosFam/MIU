package com.example.BankClientKafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class BankClientKafkaApplication {
	@Autowired
	private KafkaTemplate<String , String> kafkaTemplate;
	@Autowired
	Sender sender;


	public static void main(String[] args) {
		SpringApplication.run(BankClientKafkaApplication.class, args);
	}

	public void run(String... args) throws Exception {

		// Subscribing messages from server using kafka
		// create an account
		AccountInstruction createAccount = new AccountInstruction(33L, "createAccount","Mary Smith");
		//convert instruction to JSON string
		ObjectMapper objectMapper = new ObjectMapper();
		String createAccountAsString = objectMapper.writeValueAsString(createAccount);
		System.out.println("Sending kafka message" + createAccountAsString);
		sender.send("accountTopic", createAccountAsString);

		//deposit
		AccountInstruction deposit = new AccountInstruction(33L, "deposit",30000.0);
		ObjectMapper objectMapper1 = new ObjectMapper();
		String createDepositAsString = objectMapper1.writeValueAsString(deposit);
		System.out.println("Sending deposit message using kafka "+ createDepositAsString);
		sender.send("acccountTopic", createDepositAsString);

		//withdraw
		AccountInstruction withdraw = new AccountInstruction(33L, "withdraw",200.0);
		//convert instruction to JSON string
		String withdrawAsString = objectMapper.writeValueAsString(withdraw);

		System.out.println("Sending a Kafka message:" + withdrawAsString);
		sender.send("accountTopic",withdrawAsString);







	}
}
