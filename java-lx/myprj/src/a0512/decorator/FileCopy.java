package a0512.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;


public class FileCopy {
	
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("d:\\FeiQ.exe");
		BufferedInputStream bis = new BufferedInputStream(is);
		CheckedInputStream cis = new CheckedInputStream(bis, new CRC32());
		//cis 文件的校验 缓冲
		OutputStream os = new FileOutputStream("c:\\FeiQ.exe");
		BufferedOutputStream bos = new BufferedOutputStream(os);
		int data = 0;
		long s = System.currentTimeMillis();
		while((data = is.read()) != -1){
			os.write(data);
		}
		long e = System.currentTimeMillis();
		System.out.println(e - s);
		bos.close();
		bis.close();
		
	}
}
