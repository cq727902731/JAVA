import java.util.Scanner;
import java.util.Random;


class CalendarDemo{
	public static void main(String[] args){
		System.out.println("************��ӭʹ��������************");
	    Scanner sc = new Scanner(System.in);
		System.out.println("���������:");
			int i = sc.nextInt();
		System.out.println("�������·�:");
			int j = sc.nextInt();
		System.out.println("\n\n\n������\t����һ\t���ڶ�\t������\t������\t������\t������");
			int iArray[] = new int [30];
			Random rand = new Random();
			
			for (int a = 0;a < iArray.length ;){
				int randNum = rand.nextInt(30) + 1;
				boolean flag = false;
				for (int b = 0;b < iArray.length - 1 ;b++){
					if(iArray[b] == randNum){
						flag = true;
						break;
				}
			}
			if (!flag){
				iArray[a] = randNum;
				a++;
			}
		}
		for(int a=0;i < iArray.length;i++){
			 System.out.print("\t" + iArray[a]);
		}
	}							
}