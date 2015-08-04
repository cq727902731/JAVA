package a0512.decorator;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFileInfo {
	
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("d:\\data.txt");	//×Ö½Ú
		Reader reader = new InputStreamReader(is);	//ÊÊÅäÆ÷Ä£Ê½
		int data = 0;
		while((data = reader.read()) != -1){
			System.out.print((char)data);
		}
		reader.close();
	}
}
