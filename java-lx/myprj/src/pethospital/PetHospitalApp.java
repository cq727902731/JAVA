package pethospital;

public class PetHospitalApp
{

	public static void main(String[] args){
		
	    Vet v = new Vet("��ͮ");
		Dog dog = new Dog("tom");
		Cat cat = new Cat("�ӷ�");
		Mouse mouse = new Mouse("jarry");
		Lizard lizard = new Lizard("mark");
		Snake snake = new Snake("����ɯ");
		
		v.giveShot(mouse);
		v.giveShot(dog);
		v.giveShot(cat);
		v.giveShot(lizard);
		v.giveShot(snake);
		
	}
}