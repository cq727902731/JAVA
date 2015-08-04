import java.util.Scanner; 
import java.util.InputMismatchException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



class Calculator2{

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
		//if (b==0)throw new IllegalArgumentException("除数不能为0");
		return a / b;
	}

	public int menu(){
		Scanner sc = null;
		System.out.println("****欢迎使用文远计算器****");
		System.out.println("*\t按1计算，按2退出\t*"); 
		System.out.println("**************************"); 
		System.out.println("请选择："); 
		int command = 0;
		boolean flag = false;
		Pattern p = Pattern.compile("[1-2]");
		Matcher m = null;
		while(true){
			try{
				sc = new Scanner(System.in);
				command = sc.nextInt();
				m = p.matcher(String.valueOf(command));
				boolean b = m.matches();
				if (b){
					// System.out.println(s);
					flag = true;
					break;
				}else{
					System.out.println("输入有误 请输入1,2两个数字");
					System.out.println("请选择");
				}
			}catch(InputMismatchException e){
				System.out.println("输入有误 请输入1,2两个数字");
				System.out.println("请选择");
			}
		}
		return command;
	}
	public void calc(){
		Scanner sc = null;
		int i = 0;
		int j = 0;
		boolean flag = false;
		System.out.println("请输入第一个数：");
		while (true){
			try{
				sc = new Scanner(System.in);
				i = sc.nextInt();
				flag = true;	
			}
			catch (InputMismatchException e){
				System.out.println("输入错误，请输入整数");
				System.out.println("请重新输入第一个数："); 	
			}
			if(flag)
				break;
		}
		flag = false;
		System.out.println("请输入第二个数：");
		while (true){
			try{
				sc = new Scanner(System.in);
				j = sc.nextInt();
				flag = true;
			}
			catch (InputMismatchException e){
				System.out.println("输入错误，请输入整数");
				System.out.println("请重新输入第二个数："); 	
			}
			if(flag)
				break;	
		}
		System.out.println("请输入要进行的操作:+、-、*、/");
			String sign = null;//判断sign的符号，调用对应方法进行计算打印结果
			int result = 0;
			Pattern p = Pattern.compile("[+,-,*,/]");
			Matcher m = null;
			while(true){
				try{
					sign = sc.next();
					m = p.matcher(String.valueOf(result));
					boolean b = m.matches();
					if (b){
						switch (sign){
						case "+":                       
							result = this.add(i,j);
								break;
						case "-":
							result = this.sub(i,j);
								break;
						case "*":
							result = this.mut(i,j);
								break;
						case "/":
							result = this.div(i,j);
								break;
						}
						flag = true;
						break;
					}else{
						System.out.println("您输入的的操作符有误");
						System.out.println("请输入要进行的操作:+、-、*、/");
					}
				}catch(InputMismatchException e){
					System.out.println("您输入的的操作符有误");
					System.out.println("请输入要进行的操作:+、-、*、/");
				}
			}
		System.out.println(i + " " + sign + " " + j + " " + " = " + result);
	}
	public void exit(){
		System.exit(0);
	}
	public static void main(String[] args){    
		Calculator2 c = new Calculator2();
		int cmd = c.menu();
		if(cmd == 2){
		c.exit();
		}else{
		c.calc();
		}
	}
		
}
		
		
		
		