package bank.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;

import bank.domain.Customer;


public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    default void saveCustomer(Customer customer) {
//        throw new RuntimeException("could not save customer");
        save(customer);
    }
}




