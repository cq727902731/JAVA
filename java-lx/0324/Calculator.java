import java.io.*;
import java.util.regex.*;
import java.util.Scanner; 

class Calculator{

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
		System.out.println("按1进行计算\t按2退出计算器\n请输入命令：");
		Scanner sc = new Scanner(System.in);
		int command = sc.nextInt();
		return command;
	}
	public void run(Calculator c){
		Scanner sc = new Scanner(System.in);
		try {
		   System.out.println("请输入第一个数字:");
		   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		   String i = reader.readLine();
		   while(!i.matches("\\d+"))
		   {
		   System.out.println("输入的不是数字，请重新输入");
		   i = reader.readLine();
		   }
		   System.out.println("请输入第二个数字:");
		   String j = reader.readLine();
		   while(!Pattern.compile("[0-9]*").matcher(j).matches())
		   {
		   System.out.println("输入的不是数字，请重新输入");
		   j = reader.readLine();
		   }
		   /*System.out.println("请输入要进行的操作:+、-、*、/");
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
			System.out.println(i + " " + sign + " " + j + " " + " = " + result);*/
		} catch (IOException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	}