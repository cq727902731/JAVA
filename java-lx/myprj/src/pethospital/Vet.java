package pethospital;


public class Vet{
	private String name;

	public Vet(String name){
		this.name = name;
	}
	
	public void giveShot(Animal animal){
		System.out.print(name  + "����");
		animal.makeNoise();
	}
	
	/*public void giveShot(Dog dog){
		System.out.print(name  + "����");
		dog.makeNoise();
	}

	public void giveShot(Cat cat){
		System.out.print(name  + "����");
		cat.makeNoise();
	}
	public void giveShot(Mouse mouse){
		System.out.print(name  + "����");
		mouse.makeNoise();
	}
	
	public void giveShot(Lizard lizard){
		System.out.print(name  + "����");
		lizard.makeNoise();
	}
	public void giveShot(Snake snake){
		System.out.print(name  + "����");
		snake.makeNoise();
	}*/
}