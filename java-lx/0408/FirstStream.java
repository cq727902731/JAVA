import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


class FirstStream{

	public static void main(String[] args){
		OutputStream is = null;
		try{
			is = new FileOutputStream("C:\\data1.txt");
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
			
		byte data = 0;
		try{
			while ((data = is.write(byte)) != -1){
				System.out.print((byte)data + "CQSB"); 	
			}
	
		}
		catch (IOException e){
			e.printStackTrace();
		}finally{
			try{
				if (is != null)
					is.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}