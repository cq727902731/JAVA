package a0423;

public class Auto {
	private int tyreNumber;
	private String color;
	private int weight;
	private int speed;
	/*������̥������������ɫ�������������ٶȵȳ�Ա����*/
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
		return "[��̥����=" + tyreNumber + ", ��ɫ=" + color
				+ ", ����=" + weight + ", �ٶ�=" + speed + ",";
	}
	
}
