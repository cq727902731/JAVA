package a0513;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputDemo {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = null;	//  ≈‰∆˜
		BufferedReader br = null;	//◊∞ Œ
		String data = "";
		try {
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			while ((data = br.readLine()) != null) {
				if ("88".equals(data))
					break;
				System.out.println(data);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("........");
	}
}
