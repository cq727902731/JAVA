import java.util.Scanner;

public class Calendar 
{
 public static void main(String[] args)
 {
  new calendar().makeCalendar();
 }
   public void makeCalendar()
   {
    int i;
    int j;
    int year = 0;
    int month = 0;
    int week = 0;
    int totalDay = 0;
  
    Scanner scanner = new Scanner(System.in);
    Calendar ca = Calendar.getInstance();
    printAsterisk();
    System.out.print("�� ӭ ʹ �� �� �� ��");
    printAsterisk();
    
    System.out.print("\n\n���������:");
    year = scanner.nextInt();
    System.out.print("\n\n�������·�:");
    month = scanner.nextInt() ;
    
    ca.set(year, month - 1,1);
   week = ca.get(Calendar.DAY_OF_WEEK)-1;//��ȡ�����µ�һ�������ڼ�
   
    if( month != 2)
    totalDay =  calculatetotalDay(year , month);
    else
    {
     if(judgeLeap_year(year))
     totalDay =  calculatetotalDay(year , month) + 1;//��������꣬��һ��
     else
      totalDay =  calculatetotalDay(year , month);
    }
    
    System.out.println("\n\n\n������\t����һ\t���ڶ�\t������\t������\t������\t������");
    
    for(i = 0;i < week;i++)
    {
     System.out.print("\t");
    }    for( i = 1; i < (8 - week);i++)
     System.out.print(i + "\t");    
    for( i = (8 - week),j = 0;i <=  totalDay;i++,j++)
    {
     if(j % 7 == 0)
      System.out.println();
     System.out.print(i+"\t");
    }
    
    
    
   }
   public void printAsterisk()
   {
    int i;
    for( i = 0 ; i < 18;i++)
     System.out.print("*");
   }
   //��ȡ�����µ�����
   public int calculatetotalDay(int year ,int month)
   {
    int result = 0;
    
    switch (month) 
    {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12: result = 31;
   break;
    case 4:
    case 6:
    case 9:
    case 11:result = 30;
    break; 
  default:result = 28;
  break;
 }
    return result;
   }
   //�ж�����
   public boolean judgeLeap_year(int year)
   {
    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
     return true;
    else 
     return false;
   }
}