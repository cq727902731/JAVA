import java.io.*;

class InputStreamDemo{
		
	public static void main(String[] args) throws IOException{
		
		InputStream is = System.in; //���׳��쳣
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		OutputStream os = new FileOutputStream("D:\\photo\\˵��.txt");
		PrintWriter pw = new PrintWriter(os,true);


		String data = null;
		System.out.println("�������ļ������ݲ�����end����:");
		
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