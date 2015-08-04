import java.io.IOException;
import java.io.*;
public class Demo7_8
{
 public static void main(String[] args)
 {
  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  String brr = null;
  
  
   System.out.println("请输入评判官的人数，并按回车：");
   try {
    brr = br.readLine();
   } catch (IOException e) {
    e.printStackTrace();
   }
  
   int len=Integer.parseInt(brr); 
   
   float fen[]=new float[len];
   
   for(int i=0;i<len;i++)
   {
    BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
    String brr2 = null;
    System.out.println("请输入第"+(i+1)+"个评判官给的分数,并按回车:");
    
    try {
     brr2 = br2.readLine();
    } catch (IOException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
    }
    
    fen[i]=Float.parseFloat(brr2);
   }
    
   System.out.println("你输入的分数是: ");
   for(int i=0;i<len;i++)
   {
   System.out.print(fen[i]+" ");
   }
   
   System.out.println();
 
   Ath ath=new Ath(fen); 
   System.out.println("最大值是："+ath.max());
   System.out.println("最小值是："+ath.min());
   System.out.println("去掉最大值和最小值以后的总分数是："+ath.total());
   System.out.println("去掉最大值和最小值以后的最终平均分是："+(ath.Avg()));   
 }
}
class Ath
{
 
 int len;
 
 float max1,min1;
 
 float pfen[]=null;
 public Ath(float fen[])
 { 
  
  this.len=fen.length;
  this.pfen=fen;
 
  this.max1=pfen[0];
     this.min1=pfen[0];         
 }
 public float max()
 { 
  for (int i=1;i<len;i++)
  {
   if (max1<pfen[i]) max1=pfen[i];  
  }
 return max1;
 }
 public float min()
 { 
  for (int i=1;i<len;i++)
  {
   if (min1>pfen[i]) min1=pfen[i];  
  }
 return min1;
 }
 
 public float total()
 {
  float total=0.0f;
  for(int i=0;i<len;i++)
  {
   total+=pfen[i];
  }
  total=total-(min()+max());
  return total;
 }
 
 public float Avg()
 {
  float avg1=0.0f;  
  avg1=total()/(len-2);  
  return avg1;  
 }
 
}