package pethospital;

public class Dog extends Animal{

	public Dog(String name){
		super(name);
	}
	
	public void makeNoise(){
		System.out.println(getName() + "ЭєЭєНа");
	}
}