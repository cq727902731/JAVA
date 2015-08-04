
package a0513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListDemo {
	
	public static void main(String[] args) {
		
		/*List lst = new ArrayList();
		System.out.println("集合中有" + lst.size());
		for (int i = 1; i < 11; i++) {
			lst.add(i);
		}
		System.out.println("集合中有" + lst.size());
		//迭代器来遍历集合中的元素
		Iterator iter = lst.iterator();	
		//迭代
		while(iter.hasNext()){
			Object o = iter.next();
			System.out.println(o.getClass().getName() + " - " + o);
		}*/
		
		/*List lst = new ArrayList();
		lst.add(new Student("cq", 90));
		lst.add(new Student("cy", 86));
		lst.add(new Student("ytt", 89));
		Student ytt = new Student("ytt", 89);
		lst.add(ytt);
		lst.add(ytt);
		lst.add(1,new Student("lt", 60));
		System.out.println(lst.size());
		
		int sum = 0;
		for (int i = 0; i < lst.size(); i++) {
			Object obj = lst.get(i);
			if (obj instanceof Student){	//
				Student s = (Student)obj;
				sum += s.getScore();
				System.out.println(s.getName());
			}
			
		}
		System.out.println(sum * 1.0 / lst.size());*/
		
		/*Iterator iter = lst.iterator();
		int sum = 0;
		while(iter.hasNext()){
			Object obj = iter.next();
			if (obj instanceof Student){	//
				Student s = (Student)obj;
				sum += s.getScore();
			}
			
		}
		System.out.println(sum / 3.0);*/
		
		
		Set<Student> s = new HashSet<Student>();
		s.add(new Student("cq", 90));
		s.add(new Student("lt", 60));
		s.add(new Student("cy", 86));
		Student ytt = new Student("ytt", 89);
		s.add(ytt);
		s.add(ytt);
		System.out.println(s.size());
		int sum = 0;
		
		Iterator<Student> iter = s.iterator();
		while(iter.hasNext()){
			/*Object obj = iter.next();
			if (obj instanceof Student){
				Student ss = (Student) obj;
				System.out.println(ss.getName());
			}*/
			Student ss = iter.next();
			
		}
		
		System.out.println(sum * 1.0 / s.size());
	}

}
