import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class ImageCopy{

	public static void main(String[] args) throws IOException{    
	    InputStream is = null;
		OutputStream os = null;
		File file = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			do{
				System.out.println("��������Ҫ�����ļ��ľ���·����");
				file = new File(br.readLine()); //
			}while(!(file.isFile() && file.exists()));
			//System.out.println(file.getName());
			
			is = new FileInputStream(file);
			os = new FileOutputStream("d:\\photo\\����\\" + file.getName());
			int len = 0;
			byte[] buff = new byte[8192];
			while ((len = is.read(buff)) != -1){	
				os.write(buff,0,len);	
			}
			System.out.println("�ļ����Ƴɹ�"); 
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try{
				if (br != null){
					br.close();
				}
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}