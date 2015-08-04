import java.io.*;

class InputStreamDemo{
		
	public static void main(String[] args) throws IOException{
		
		InputStream is = System.in; //会抛出异常
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		OutputStream os = new FileOutputStream("D:\\photo\\说明.txt");
		PrintWriter pw = new PrintWriter(os,true);


		String data = null;
		System.out.println("请输入文件的内容并输入end结束:");
		
		while((data = br.readLine()) != null){
			if("end".equals(data)){
				break;
			}
			pw.println(data);
		}
		br.close();
		pw.close();
	}
}