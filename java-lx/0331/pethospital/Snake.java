package pethospital;

public class Snake extends Animal{
	public Snake(String name){
		super(name);
	}

	@Override 
		public void makeNoise(){
			System.out.println("па~па~");
	}
}