import java.io.*;
import java.util.regex.*;
import java.util.Scanner; 

class Calculator{

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
		Calculator c = new Calculator();
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
	public void run(Calculator c){
		Scanner sc = new Scanner(System.in);
		try {
		   System.out.println("�������һ������:");
		   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		   String i = reader.readLine();
		   while(!i.matches("\\d+"))
		   {
		   System.out.println("����Ĳ������֣�����������");
		   i = reader.readLine();
		   }
		   System.out.println("������ڶ�������:");
		   String j = reader.readLine();
		   while(!Pattern.compile("[0-9]*").matcher(j).matches())
		   {
		   System.out.println("����Ĳ������֣�����������");
		   j = reader.readLine();
		   }
		   /*System.out.println("������Ҫ���еĲ���:+��-��*��/");
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
			System.out.println(i + " " + sign + " " + j + " " + " = " + result);*/
		} catch (IOException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	}