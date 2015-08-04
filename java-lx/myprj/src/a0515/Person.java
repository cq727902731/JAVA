package a0515;

public class Person {

	private Integer id;
	private String name;
	
	public Person(){
		super();
	}
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return super.hashCode() + "|" + super.toString() + "[id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj instanceof Person) {
			Person other = (Person) obj;
			if (this.getId() == other.getId() && this.getName().equals(getName())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return id.hashCode() + 100 + name.hashCode();
	}
	
}
