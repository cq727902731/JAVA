import java.io.*;

class ReaderDemo{

	public static void main(String[] args) throws IOException{    
	    InputStream is = new FileInputStream("data.txt");
		InputStreamReader isr = new InputStreamReader(is); //�ֽ�װ���ַ�
		BufferedReader br = new BufferedReader(isr);		//װ�γɴ������ַ���

		String data = null;
		int lineNumber = 0;
		while ((data = br.readLine()) != null){
			lineNumber++;
			System.out.println(data); 
		}
		System.out.println("����" + lineNumber + "��");
		br.close();
	}		
}