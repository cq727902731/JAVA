import java.io.*;

class StandardStream{

	public static void main(String[] args) throws IOException{
	    InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String data = null;
		System.out.println("������");
		
		while((data = br.readLine())!= null){			
			System.out.println(data);
			if(data.equals("88")){
				break;
			}
			System.out.println("���ٴ����룺");
		}
		br.close();
	}
}
