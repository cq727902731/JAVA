import java.util.Scanner; 

class Calculator1{

	public int add(int a,int b){
		//int sum = a+b;
		return a + b;
	}

	public int sub(int a,int b){
		//int sum = a-b;
		return a - b;
	}
	
	public int mut(int a,int b){
		//int sum = a*b;
		return a * b;
	}
	
	public int div(int a,int b){
		//int sum = a/b;
		return a / b;
	}

	public void powerOn(){
		System.out.println("��ӭʹ�ü�����");
		return;
	}

	public void powerOff(){
		System.out.println("��ӭ�ٴ�ʹ��");
	}
}

class Main{

	public static void main(String[] args){
		Main main = new Main();
		Calculator1 c = new Calculator1();
			c.powerOn();
		while (true){
			int r = main.menu();
			if (r == 1){
				main.run(c);

			}else {
				break;
			}
		}
		c.powerOff();
	}
	public int menu(){
		System.out.println("��1���м���\t��2�˳�������\n���������");
		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();
		return command;
	
	}
	public void run(Calculator1 c){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
			int i = sc.nextInt();
		System.out.println("������ڶ�����");		
			int j = sc.nextInt();
		System.out.println("������Ҫ���еĲ���:+��-��*��/");
			String sign = sc.next();//�ж�sign�ķ��ţ����ö�Ӧ�������м����ӡ���
			int result = 0;
			switch (sign){
			case "+":                       
				result = c.add(i,j);
					break;
			case "-":
				result = c.sub(i,j);
					break;
			case "*":
				result = c.mut(i,j);
					break;
			case "/":
				result = c.div(i,j);
					break;
			default:
				System.out.println("������ĵĲ���������");
					break;
			}
		System.out.println(i + " " + sign + " " + j + " " + " = " + result);
	}
}