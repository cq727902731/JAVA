package a0513;

public class Demo {
	
	public static void main(String[] args) {
		Student[] persons = new Student[9];
		
		for (int i = 0; i < 9; i++) {
			persons[i] = new Student();
		}
		//persons[8] = null;
		persons = new Student[18];
		for (int i = 8; i < persons.length; i++) {
			persons[i] = new Student();
		}
		for (Student student : persons) {
			System.out.println(student);
		}
	}
}
