package a0514;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> ll = new LinkedList<Integer>();
		long s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			l.add(0,i);
		}
		long e = System.currentTimeMillis();
		System.out.println(e - s);
		
		s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			ll.add(0,i);
		}
		e = System.currentTimeMillis();
		System.out.println("ll:" + (e - s));
	}

}
