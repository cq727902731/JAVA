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
	System.out.println("��ʼ����:");
	while(true){
		System.out.println("���������²����:");
		int data = sc.nextInt();
		if(a.bigSmallEqual(data)>0){
			System.out.println("����");
		}else if (a.bigSmallEqual(data)<0){
			System.out.println("С��");
		}else{
			System.out.println("�����ɶ���");
			break;
		}
	}
}
}