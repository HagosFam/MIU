package client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class Application implements CommandLineRunner {

	RestTemplate restTemplate = new RestTemplate();
	private String serverUrl = "http://localhost:8080/books";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// add books
		restTemplate.postForLocation(serverUrl, new Book("125", "Book 3", 20.95, "Mary Jones"));
		restTemplate.postForLocation(serverUrl, new Book("135", "Book 6", 14.95, "Franky Jones"));
		System.out.println("Books with isbn 125-----------------");
		Book book = restTemplate.getForObject(serverUrl+"/125", Book.class);
		System.out.println(book.getTitle());
		System.out.println("All books-----------------");
		Books books = restTemplate.getForObject(serverUrl, Books.class);
		for (Book thebook : books.getBooks()) {
			System.out.println("Book : title="+thebook.getTitle());
		}
		System.out.println("Books from Mary Jones -----------------");
		Books authorbooks = restTemplate.getForObject("http://localhost:8080/searchbooks/Mary Jones", Books.class);
		for (Book thebook : authorbooks.getBooks()) {
			System.out.println("Book : title="+thebook.getTitle());
		}
	}
}
