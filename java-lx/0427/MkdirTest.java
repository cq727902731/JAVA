import java.io.*;

public class MkdirTest {
	public static void main(String args[]) throws IOException {
		File file = new File("D:\\photo");
		boolean flag = file.isDirectory();
		if (true){
			System.out.println("�ļ��д����ɹ�"); 
			file.mkdir();	
		}else{
			System.out.println("����һ���ļ���");
			}
			
		file = new File("D:\\photo\\����");
		if (true){
			System.out.println("�ļ��д����ɹ�"); 
			file.mkdir();	
		}else{
			System.out.println("����һ���ļ���"); 
			}
		file = new File("D:\\photo\\����");
		if (true){
			System.out.println("�ļ��д����ɹ�"); 
			file.mkdir();	
		}else{
			System.out.println("����һ���ļ���"); 
			}
		file = new File("D:\\photo\\����");
		if (true){
			System.out.println("�ļ��д����ɹ�"); 
			file.mkdir();	
		}else{
			System.out.println("����һ���ļ���");
			}

		file = new File("D:\\photo\\˵��.txt");
		boolean b = file.isFile();
		if (true){
			System.out.println("�ļ������ɹ�"); 
			file.createNewFile();	
		}else{
			System.out.println("����һ���ļ�");
			}
	}
}
