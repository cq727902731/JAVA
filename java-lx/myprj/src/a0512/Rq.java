package a0512;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

public class Rq {
	
	public static String currentDateTime(){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date current = new Date();	//当前时间
		
		return df.format(current);
	}
	
	public static String currentGregorianDateTime(){
		Calendar c = new GregorianCalendar();	//当前时间
		//避免创建大量String对象
		StringBuilder sb = new StringBuilder();
		sb.append(c.get(YEAR)).append("-").
			append((c.get(MONTH) + 1) > 9 ? (c.get(MONTH) + 1) : "0" + (c.get(MONTH) + 1));
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(currentDateTime());
		System.out.println(currentGregorianDateTime());
		//DateFormat df = DateFormat.getInstance();
	
	}
}
