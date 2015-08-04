package pethospital;

public class Snake extends Animal{

	public Snake(String name){
		super(name);
	}
	
	public void makeNoise(){
		System.out.println(getName() + "папаНа");
	}
}
