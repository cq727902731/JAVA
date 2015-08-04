package myprj;

public class Person {
	
	private String name = "";
	private int age = 1;
	
	public Person(String name, int age) {
		super();
		setName(name);
		setAge(age);
	}

	public Person() {
		super();
		name = "**";
		age = 0;
	}
	
	public void setName(String name) {
		if (name.length() >= 2 && name.length() <= 4){
			this.name = name;
		}else{
			if(name.length() > 4){
				this.name = name.substring(0, 4);
			}else if(name.length() == 1){
				this.name = name + "*";
			}else if(name.length() == 0){
				this.name = "**";
			}
		}	
	}

	public void setAge(int age) {
		if (age < 0){
			this.age = 0;
			return;
		}
		this.age = age;
	}

	public static void main(String[] args) {
		Person p = new Person("Àî",-11);
		p = null;
		p = new Person();
		//p.setAge(111);
		//System.out.println(p.name);
		//System.out.println(p.age);
		
	}
	
	
}
