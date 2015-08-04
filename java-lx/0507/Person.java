
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Person{

	private Integer id;
	private String name;

	public Person(){

	}
	public Person(String name){
		this.name = name;	
	}

	public Person(Integer id){
		this.id = id;
	}
	

	public Person(String name ,Integer id){
		this.name = name;
		this.id = id;
	}


}

class Demo{

	public static void main(String[] args){  
		Person p = null;
		try{
			Class clazz = Class.forName("Person"); 
		
			Constructor c = clazz.getDeclaredConstructor(String.class,Integer.class);
			p = (Person)c.newInstance("James" , new Integer(10));
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SecurityException e){
			e.printStackTrace();
		}catch (InstantiationException e){
			e.printStackTrace();
		}catch (NoSuchMethodException e){
			e.printStackTrace();
		}catch (IllegalAccessException e){
			e.printStackTrace();
		}catch (InvocationTargetException e){
			e.printStackTrace();
		}
		System.out.println(p); 
	}
		
}