package customers;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {
	List<Student> findByName(String name);
	List<Student> findByPhone(String phone);
    List<Student> findByAddressCity(String city);
//
//    @Query("{grade : :#{#email}}")
//    Student findCustomerWithEmail(@Param("email") String email);

}

