package people;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Pet {
	private String name;
	private int age;
	

    
    
	protected Pet() {
	}



	public Pet( String name, int age) {
		super();
	
		this.age = age;
		this.name = name;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}








	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}





	



}


