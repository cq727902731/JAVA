package pethospital;

public class PetHospitalApp
{

	public static void main(String[] args){
		
	    Vet v = new Vet("¿ÓÕÆ");
		Dog dog = new Dog("tom");
		Cat cat = new Cat("º”∑∆");
		Mouse mouse = new Mouse("jarry");
		Lizard lizard = new Lizard("mark");
		Snake snake = new Snake("√¿∂≈…Ø");
		
		v.giveShot(mouse);
		v.giveShot(dog);
		v.giveShot(cat);
		v.giveShot(lizard);
		v.giveShot(snake);
		
	}
}