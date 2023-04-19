package books;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	private Map<String, Book> books = new HashMap<String, Book>();

	public BookController() {
		books.put("123", new Book("123", "Book 1", 20.95, "James Brown"));
		books.put("124", new Book("124", "Book 2", 20.95, "Mary Jones"));
	}

	@GetMapping("/books/{isbn}")
	public ResponseEntity<?> getBook(@PathVariable String isbn) {
		Book book = books.get(isbn);
		if (book == null) {
			return new ResponseEntity<CustomErrorType>(new CustomErrorType("Book is not available"),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}

	@DeleteMapping("/books/{isbn}")
	public ResponseEntity<?> deleteBook(@PathVariable String isbn) {
		books.remove(isbn);
		Book book = books.get(isbn);
		if (book == null) {
			return new ResponseEntity<CustomErrorType>(new CustomErrorType("Book is not available"),
					HttpStatus.NOT_FOUND);
		}
		books.remove(isbn);
		return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
	}

	@PostMapping("/books")
	public ResponseEntity<?> addBook(@RequestBody Book book) {
		books.put(book.getIsbn(), book);
	    return new ResponseEntity<Book>(book, HttpStatus.OK);
	}

	@PutMapping("/books")
	public ResponseEntity<?> updateBook(@RequestBody Book book) {
		books.put(book.getIsbn(), book);
	    return new ResponseEntity<Book>(book, HttpStatus.OK);
	}

	@GetMapping("/books")
	public ResponseEntity<?> getAllBooks() {
		Books allbooks = new Books(books.values());
		return new ResponseEntity<Books>(allbooks, HttpStatus.OK);
	}

	@GetMapping("/searchbooks/{author}")
	public ResponseEntity<?> searchBooks(@PathVariable String author) {
		List<Book> booksByAuthor = books.values().stream().filter(b -> b.getAuthor().equals(author)).collect(Collectors.toList());
		Books authorbooks = new Books(booksByAuthor);
		return new ResponseEntity<Books>(authorbooks, HttpStatus.OK);
	}

}
