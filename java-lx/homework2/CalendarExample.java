import java.util.Scanner;
class CalendarExample
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int year,month,day;
System.out.print("������ݣ�");
year=in.nextInt();
System.out.print("�����·ݣ�");
month=in.nextInt();
System.out.print("�������ӣ�");
day=in.nextInt();
Calendar rili=Calendar.getInstance();
System.out.println("\t��\tһ\t��\t��\t��\t��\t��");
rili.set(year,month,day);//�������ڽ���������ָ������
int xingqi=rili.get(Calendar.DAY_OF_WEEK)-1;//��¼���������ڼ��������1�����գ�7Ϊ��
String a[]=new String[xingqi+31];//��ź����һά����
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
for(int i=0;i<a.length;i++)//�������
{
if(i%7==0)
{
System.out.println("");//����
}
System.out.print("\t"+a[i]);
}
}
}