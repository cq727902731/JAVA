package pethospital;

public class Cat extends Animal{
	public Cat(String name){
		super(name);
	}

	@Override 
		public void makeNoise(){
			System.out.println("ίχ~ίχ~");
	}
}

