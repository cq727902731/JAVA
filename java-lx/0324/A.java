import java.util.Scanner;

class A{
	 int v = (int)(Math.random()*100);
	
	public int bigSmallEqual(int num){
		if (v > num){
			return -1;
		}else if (v < num){
			return 1;
		}else{
			return 0;
		}
}

public static void main(String[] args){
	A a = new A();
	Scanner sc = new Scanner(System.in);
	System.out.println("开始猜数:");
	while(true){
		System.out.println("请输入您猜测的数:");
		int data = sc.nextInt();
		if(a.bigSmallEqual(data)>0){
			System.out.println("大了");
		}else if (a.bigSmallEqual(data)<0){
			System.out.println("小了");
		}else{
			System.out.println("可下蒙对了");
			break;
		}
	}
}
}
