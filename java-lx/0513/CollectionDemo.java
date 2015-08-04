import java.util.Iterator;
import java.util.List;

public class CollectionDemo{
	
	public static void main(String[] args){    
		List lst = new ArrayList();
		System.out.println("集合中有" + lst.size());
		for(int i = 1; i < 11; i++){
			lst.add(i);
		}
		System.out.println("集合中有" + lst.size());
		//迭代器来遍历集合中的元素
		Iterator iter = 1st.iterator();
		//迭代
		while (iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o.getClass().getName() + "-" + 0);
		}
}