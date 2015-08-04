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
		System.out.println("欢迎使用计算器");
		return;
	}

	public void powerOff(){
		System.out.println("欢迎再次使用");
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
		System.out.println("按1进行计算\t按2退出计算器\n请输入命令：");
		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();
		return command;
	
	}
	public void run(Calculator1 c){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
			int i = sc.nextInt();
		System.out.println("请输入第二个数");		
			int j = sc.nextInt();
		System.out.println("请输入要进行的操作:+、-、*、/");
			String sign = sc.next();//判断sign的符号，调用对应方法进行计算打印结果
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
				System.out.println("您输入的的操作符有误");
					break;
			}
		System.out.println(i + " " + sign + " " + j + " " + " = " + result);
	}
}