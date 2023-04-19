package people;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Pet {

	@Id
	@GeneratedValue
	private long id;
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



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	



}


