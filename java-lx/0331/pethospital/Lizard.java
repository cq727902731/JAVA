package pethospital;

public class Lizard extends Animal{
	public Lizard(String name){
		super(name);
	}

	@Override 
		public void makeNoise(){
			System.out.println("яс~яс~");
	}
}