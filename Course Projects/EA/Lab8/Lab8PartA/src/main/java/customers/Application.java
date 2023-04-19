package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        // create customer
		Student student = new Student(101,"John doe", "johnd@acme.com", "0622341678");
		Address address = new Address("1000 N 4th", "FairField", "25154");
		student.setAddress(address);
		studentRepository.save(student);
		
		student = new Student(109,"John Jones", "jones@acme.com", "0624321234");
		address = new Address("8000 N 4th", "FairField", "25154");
		student.setAddress(address);
		studentRepository.save(student);
		
		student = new Student(66,"James Johnson", "jj123@acme.com", "068633452");
		address = new Address("4000 N 4th", "FairField", "25154");
		Grade grade = new Grade("EA", "A");
		student.getGrades().add(grade);
		student.setAddress(address);
		studentRepository.save(student);
		//get students
		System.out.println(studentRepository.findByName("James Johnson"));
		System.out.println(studentRepository.findByPhone("0624321234"));
		System.out.println(studentRepository.findByAddressCity("FairField"));
//		System.out.println("-----------All customers ----------------");
//		System.out.println(studentRepository.findAll());
		//update customer
//		student = studentRepository.findById(101).get();
//		student.setEmail("jd@gmail.com");
//		studentRepository.save(student);
//		System.out.println("-----------find by phone ----------------");
//		System.out.println(studentRepository.findByPhone("0622341678"));
//		System.out.println("-----------find by email ----------------");
//		System.out.println(studentRepository.findCustomerWithEmail("jj123@acme.com"));
//		System.out.println("-----------find customers with a certain type of creditcard ----------------");
//		List<Student> students = studentRepository.findByCreditCardType("Visa");
//		for (Student stu : students){
//			System.out.println(stu);
//		}

	}

}
