public class Vehicle{
	int speed;//�ٶ�
	int v;//���

	public void move(){
		System.out.println("�ƶ�")��
	}
	public setSpeed(int s){
		speed = s;
	}
	public void speedUp(){
		System.out.printle("��ǰ�ٶ�Ϊ:" + speed);
		speed++;
		System.out.printle("���ٺ��ٶ�Ϊ:" + speed);

	}
	public void speedDown(){
		System.out.printle("��ǰ�ٶ�Ϊ:" + speed);
		speed--;
		System.out.printle("���ٺ��ٶ�Ϊ:" + speed);
	}
	public void init(int s,int vv){
		speed = s;
		v = vv;
		System.out.println("�ٶ�:" + speed + "���:" + v);
	public static void main(String[] args){
		Vehicle ts = new Vehicle();
		v1.init(50,10);
		v1.speedUp();


}



}
}
