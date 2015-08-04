import java.util.Scanner;
class CalendarExample
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int year,month,day;
System.out.print("输入年份：");
year=in.nextInt();
System.out.print("输入月份：");
month=in.nextInt();
System.out.print("输入日子：");
day=in.nextInt();
Calendar rili=Calendar.getInstance();
System.out.println("\t日\t一\t二\t三\t四\t五\t六");
rili.set(year,month,day);//设置日期将日历翻到指定日期
int xingqi=rili.get(Calendar.DAY_OF_WEEK)-1;//记录星期是星期几，如果是1就是日，7为六
String a[]=new String[xingqi+31];//存放号码的一维数组
for(int i=0;i<xingqi;i++)
{
a[i]="**";
}
for(int i=xingqi,n=1;i<xingqi+31;i++)
{
if(n<=9)
{
a[i]=String.valueOf(n);				
}
else
{
a[i]=String.valueOf(n);
}
n++;
}
for(int i=0;i<a.length;i++)//输出数组
{
if(i%7==0)
{
System.out.println("");//换行
}
System.out.print("\t"+a[i]);
}
}
}