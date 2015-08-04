package pethospital;

public class Vet{
	private String name;

	public Vet(){}

	public Vet(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;	
	}
	public String getName(){
		return name;
	}

	public void giveShot(Dog dog){
		System.out.println("��ҽ" + name + "Ϊ" + dog.getName() + "����"); 
		dog.makeNoise();
	}
	public void giveShot(Cat cat){
		System.out.println("��ҽ" + name + "Ϊ" + cat.getName() + "����"); 
		cat.makeNoise();
	}
	public void giveShot(Mouse mouse){
		System.out.println("��ҽ" + name + "Ϊ" + mouse.getName() + "����");
		mouse.makeNoise();

	}
	public void giveShot(Snake snake){
		System.out.println("��ҽ" + name + "Ϊ" + snake.getName() + "����");
		snake.makeNoise();
	}
	public void giveShot(Lizard lizard){
		System.out.println("��ҽ" + name + "Ϊ" + lizard.getName() + "����");
		lizard.makeNoise();
	}
		
}
	