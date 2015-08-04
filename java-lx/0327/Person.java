class Person{
	private String name;
	private int age;

	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Person(){
		name = "**";
		age = 0;
	}
	public void setAge(int age){
		if (age < 0){
			age = 0;
		}else{
			this.age = age;
		}
	}

	public void setName(String name){
		if (name.length() < 2){
			if (name.length() == 0){
				this.name = "**";
			}else{
				this.name = name + "*";
			}
		}else if (name.length() > 4){
			this.name = name.substring(0,4);
		}
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}

	public static void main(String[] args){
		Person p = new Person();
		System.out.println(p.getName());
		System.out.println(p.getAge());
		p.setName("fsfds");
		p.setAge(12);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}






