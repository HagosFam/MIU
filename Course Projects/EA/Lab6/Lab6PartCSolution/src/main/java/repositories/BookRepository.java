package repositories;

import domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface BookRepository extends JpaRepository<Book, Long> {
    @Modifying
    @Transactional
    @Query("update Book b set b.locationCode = 'BB'+b.locationCode")
    public void changeLocationCode();

    @Modifying
    @Transactional
    @Query("delete Book b where b.publicationYear < :year")
    public void removeOldBooks(@Param("year") int year);
}
