package a0423;

public class Car extends Auto {
	private String airCondition;
	private String cd;

	public Car() {
	}

	public Car(int tyreNumber, String color, int weight, int speed,
			String airCondition, String cd) {
		super(tyreNumber, color, weight, speed);
		this.airCondition = airCondition;
		this.cd = cd;
	}

	@Override
	public String toString() {
		return super.toString() + "空调=" + airCondition + ", CD=" + cd + "]";
	}

	public static void main(String[] args) {
		/*
		 * Auto benz = new Auto(4, "black", 2000); System.out.println(benz);
		 * //benz.toString() benz.addSpeed(); System.out.println(benz);
		 * //benz.toString() benz.addSpeed(100); System.out.println(benz);
		 * //benz.toString()
		 */

		Car bmw = new Car(4, "black", 2000, 0, "自动空调", "单碟");
		bmw.addSpeed();
		System.out.println(bmw); // bmw.toString();

	}
}
