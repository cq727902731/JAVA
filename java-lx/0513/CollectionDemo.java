import java.util.Iterator;
import java.util.List;

public class CollectionDemo{
	
	public static void main(String[] args){    
		List lst = new ArrayList();
		System.out.println("��������" + lst.size());
		for(int i = 1; i < 11; i++){
			lst.add(i);
		}
		System.out.println("��������" + lst.size());
		//�����������������е�Ԫ��
		Iterator iter = 1st.iterator();
		//����
		while (iter.hasNext()) {
			Object o = iter.next();
			System.out.println(o.getClass().getName() + "-" + 0);
		}
}