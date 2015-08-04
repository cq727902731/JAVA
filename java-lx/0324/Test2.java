import java.io.*;
import java.util.regex.*;
public class Test2 {

 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub

  try {
   System.out.println("请输入第一个数字:");
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   String num1 = reader.readLine();
   while(!num1.matches("\\d+"))
   {
   System.out.println("输入的不是数字，请重新输入");
   num1 = reader.readLine();
   }
   System.out.println("请输入第二个数字:");
   String num2 = reader.readLine();
   while(!Pattern.compile("[0-9]*").matcher(num2).matches())
   {
   System.out.println("输入的不是数字，请重新输入");
   num2 = reader.readLine();
   }
   int result = Integer.parseInt(num1) * Integer.parseInt(num2);
   System.out.println("乘积是："+ result);
   } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
   }
 }
}
