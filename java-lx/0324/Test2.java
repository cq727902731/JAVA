import java.io.*;
import java.util.regex.*;
public class Test2 {

 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub

  try {
   System.out.println("�������һ������:");
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   String num1 = reader.readLine();
   while(!num1.matches("\\d+"))
   {
   System.out.println("����Ĳ������֣�����������");
   num1 = reader.readLine();
   }
   System.out.println("������ڶ�������:");
   String num2 = reader.readLine();
   while(!Pattern.compile("[0-9]*").matcher(num2).matches())
   {
   System.out.println("����Ĳ������֣�����������");
   num2 = reader.readLine();
   }
   int result = Integer.parseInt(num1) * Integer.parseInt(num2);
   System.out.println("�˻��ǣ�"+ result);
   } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
   }
 }
}
