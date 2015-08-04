import java.io.*;

class ReaderDemo{

	public static void main(String[] args) throws IOException{    
	    InputStream is = new FileInputStream("data.txt");
		InputStreamReader isr = new InputStreamReader(is); //字节装配字符
		BufferedReader br = new BufferedReader(isr);		//装饰成带缓冲字符流

		String data = null;
		int lineNumber = 0;
		while ((data = br.readLine()) != null){
			lineNumber++;
			System.out.println(data); 
		}
		System.out.println("共有" + lineNumber + "行");
		br.close();
	}		
}