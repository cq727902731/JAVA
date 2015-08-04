
package a0515;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Person tom = new Person(1,"TOM");
		Person mark = new Person(2,"MARK");
		Person jerry = new Person(3,"JERRY");
		Person john = new Person(4,"JOHN");
		Person jack = new Person(5,"JACK");
		
		System.out.println(jack.equals(tom));  //同一性 等同性
		
		Set<Person> s = new HashSet<Person>();
		s.add(tom);
		s.add(mark);
		s.add(jerry);
		s.add(john);
		s.add(jack);
		
		System.out.println(s.size());
		
		Iterator<Person> iter = s.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
