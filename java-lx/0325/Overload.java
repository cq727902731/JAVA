import java.util.Scanner;

class Overload{
 
	public void add(String a){
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("请输入第一个字符串");		
		String x = sc.next();

		System.out.println("请输入第二个字符串");
		String y = sc.next();
		
		String sum = x + y;
		System.out.println(sum);
		
	}
	public void add(int a){
		Scanner sc = new Scanner(System.in);
	    System.out.println("请输入第一个字符串");		
		int x = sc.nextInt();

		System.out.println("请输入第二个字符串");
		int y = sc.nextInt();
		
		int sum = x + y;
		System.out.println(sum);
		
	
	}
	public void add(double a){
		Scanner sc = new Scanner(System.in);
	    System.out.println("请输入第一个字符串");		
		double x = sc.nextDouble();

		System.out.println("请输入第二个字符串");
		double y = sc.nextDouble();
		
		double sum = x + y;
		System.out.println(sum);
		
	
	}

	public static void main(String[] args){


	Overload ol= new Overload();

	System.out.println("按1进行字符串相加\n按2进行整数相加\n按3进行浮点数相加");
	Scanner sc = new Scanner(System.in);
	int z = sc.nextInt();
	
	switch (z){
	case 1:
		ol.add("h");
		break;
	case 2:
		ol.add(2);
		break;
	case 3:
		ol.add(0.5);
		break;
	
		}
	}
}