package pethospital;

public class Dog extends Animal{
	public Dog(String name){
		super(name);
	}

	@Override 
		public void makeNoise(){
			System.out.println("Íô~Íô~");
	}
}

		