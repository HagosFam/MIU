package mvc.Books;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    Map<String, Book> books = new HashMap<>();

   public BookController() {
       books.put("Daniela Steel", new Book("Daniela steel", "232343", "Nancy", 210)  );
       books.put("Anna Frank", new Book("Anna Frank", "232434", "The Diary of young girl", 310)  );
       books.put("Stephen Covey", new Book("Stephen Covey", "24343", "Effectivness", 200)  );
   }


   @GetMapping("/books/{author}")
    public ResponseEntity<?>  getBook(@PathVariable String author) {
       Book book = books.get(author);
       if(book==null) {
         return new  ResponseEntity<CustomErrorType>(new CustomErrorType("Book not found"), HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<Book>(book, HttpStatus.OK);
    }
   @PostMapping("/books")
   public ResponseEntity<?> addBook(@RequestBody Book book) {
       books.put(book.get(), book );
       return new ResponseEntity<Book>(book, HttpStatus.OK);
   }

   @DeleteMapping("/delete/{isbn}")
    public ResponseEntity<?> deleteBook(@PathVariable String isbn) {
       Book book = book.getIsbn(isbn);



    }
  public ResponseEntity<?> updateBook(Book book) {

  }


  public ResponseEntity<?>  getAllBooks() {

  }
  public ResponseEntity<?> searchBooks(String author) {

  }

}
