package people;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		StopWatch sw = new StopWatch();
		sw.start();
		for(int i =0 ; i<10000;i++) {
			Person person = new Person((i+1),"Abel"+i,"Dessalegne"+i);
			for(int j=0; j<10;j++) {
				Pet pet = new Pet("jacki"+i, i*2);
				person.getPets().add(pet);
				personRepository.save(person);
			}
		}
		sw.stop();
		long totaltime=sw.getTotalTimeMillis();
		
		
		sw = new StopWatch();
		sw.start();
		List<Person> personList = personRepository.findAll();
		
		System.out.println(personList.toString());
		System.out.println("Saving with Mongo "+totaltime+" ms");
		sw.stop();
		totaltime=sw.getTotalTimeMillis();
		System.out.println("Getting with Mongo "+totaltime+" ms");
		
		
	}
}
