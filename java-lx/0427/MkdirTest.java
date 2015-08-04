import java.io.*;

public class MkdirTest {
	public static void main(String args[]) throws IOException {
		File file = new File("D:\\photo");
		boolean flag = file.isDirectory();
		if (true){
			System.out.println("文件夹创建成功"); 
			file.mkdir();	
		}else{
			System.out.println("不是一个文件夹");
			}
			
		file = new File("D:\\photo\\工作");
		if (true){
			System.out.println("文件夹创建成功"); 
			file.mkdir();	
		}else{
			System.out.println("不是一个文件夹"); 
			}
		file = new File("D:\\photo\\生活");
		if (true){
			System.out.println("文件夹创建成功"); 
			file.mkdir();	
		}else{
			System.out.println("不是一个文件夹"); 
			}
		file = new File("D:\\photo\\旅游");
		if (true){
			System.out.println("文件夹创建成功"); 
			file.mkdir();	
		}else{
			System.out.println("不是一个文件夹");
			}

		file = new File("D:\\photo\\说明.txt");
		boolean b = file.isFile();
		if (true){
			System.out.println("文件创建成功"); 
			file.createNewFile();	
		}else{
			System.out.println("不是一个文件");
			}
	}
}
