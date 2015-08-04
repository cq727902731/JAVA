public class Vehicle{
	int speed;//速度
	int v;//体积

	public void move(){
		System.out.println("移动")；
	}
	public setSpeed(int s){
		speed = s;
	}
	public void speedUp(){
		System.out.printle("当前速度为:" + speed);
		speed++;
		System.out.printle("加速后速度为:" + speed);

	}
	public void speedDown(){
		System.out.printle("当前速度为:" + speed);
		speed--;
		System.out.printle("减速后速度为:" + speed);
	}
	public void init(int s,int vv){
		speed = s;
		v = vv;
		System.out.println("速度:" + speed + "体积:" + v);
	public static void main(String[] args){
		Vehicle ts = new Vehicle();
		v1.init(50,10);
		v1.speedUp();


}



}
}
