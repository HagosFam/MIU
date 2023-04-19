package repositories;

import domain.Customer;
import domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> getAllCustomersFrom(@Param("country")String country);

    @Query("select c from Customer c where c.address.city = :city")
    List<Customer> getAllCustomersFromCity(@Param("city")String amsterdam);

}
