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
		//if (b==0)throw new IllegalArgumentException("��������Ϊ0");
		return a / b;
	}

	public int menu(){
		Scanner sc = null;
		System.out.println("****��ӭʹ����Զ������****");
		System.out.println("*\t��1���㣬��2�˳�\t*"); 
		System.out.println("**************************"); 
		System.out.println("��ѡ��"); 
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
					System.out.println("�������� ������1,2��������");
					System.out.println("��ѡ��");
				}
			}catch(InputMismatchException e){
				System.out.println("�������� ������1,2��������");
				System.out.println("��ѡ��");
			}
		}
		return command;
	}
	public void calc(){
		Scanner sc = null;
		int i = 0;
		int j = 0;
		boolean flag = false;
		System.out.println("�������һ������");
		while (true){
			try{
				sc = new Scanner(System.in);
				i = sc.nextInt();
				flag = true;	
			}
			catch (InputMismatchException e){
				System.out.println("�����������������");
				System.out.println("�����������һ������"); 	
			}
			if(flag)
				break;
		}
		flag = false;
		System.out.println("������ڶ�������");
		while (true){
			try{
				sc = new Scanner(System.in);
				j = sc.nextInt();
				flag = true;
			}
			catch (InputMismatchException e){
				System.out.println("�����������������");
				System.out.println("����������ڶ�������"); 	
			}
			if(flag)
				break;	
		}
		System.out.println("������Ҫ���еĲ���:+��-��*��/");
			String sign = null;//�ж�sign�ķ��ţ����ö�Ӧ�������м����ӡ���
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
						System.out.println("������ĵĲ���������");
						System.out.println("������Ҫ���еĲ���:+��-��*��/");
					}
				}catch(InputMismatchException e){
					System.out.println("������ĵĲ���������");
					System.out.println("������Ҫ���еĲ���:+��-��*��/");
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
		
		
		
		