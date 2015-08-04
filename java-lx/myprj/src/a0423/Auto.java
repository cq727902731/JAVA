package a0423;

public class Auto {
	private int tyreNumber;
	private String color;
	private int weight;
	private int speed;
	/*包括轮胎个数，汽车颜色，车身重量、速度等成员变量*/
	public Auto() {
	}
	public Auto(int tyreNumber, String color, int weight, int speed) {
		this.tyreNumber = tyreNumber;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	public Auto(int tyreNumber, String color, int weight) {
		this(tyreNumber, color, weight, 0);
	}
	
	public void addSpeed(int speed){
		this.speed += speed;
	}
	public void addSpeed(){
		speed++;
	}
	
	@Override
	public String toString() {
		return "[轮胎个数=" + tyreNumber + ", 颜色=" + color
				+ ", 重量=" + weight + ", 速度=" + speed + ",";
	}
	
}
