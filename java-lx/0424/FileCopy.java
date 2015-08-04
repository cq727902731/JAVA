import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileCopy{

	public static void main(String[] args){    
	    InputStream is = null;
		OutputStream os = null;

		try{
			is = new FileInputStream("cq.rar"); //���׳��쳣
			os = new FileOutputStream("d:\\cq.rar");
			int len = 0;
			long startTime = System.currentTimeMillis();
			byte[] buff = new byte[8192];
			while ((len = is.read(buff)) != -1){		//���׳��쳣
				os.write(buff,0,len);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("����������" + (endTime - startTime) + "ms"); 			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try{
				if (is != null){
					is.close();
				}
				if (os != null){
					os.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}