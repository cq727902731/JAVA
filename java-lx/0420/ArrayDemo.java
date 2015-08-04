import static com.wyhello.util.ArrayUtils.*;
import com.wyhello.util.ArrayUtilsException;

class ArrayDemo{
	public static void main(String[] args){  
		int i[] = null;
		try{
			i = productArray(20,25,true);
		}
		catch (ArrayUtilsException e){
			e.printStackTrace();	
		}
		printArray(i);
		System.out.println("≈≈–Ú");
		try{
			bubbleSort(i);
		}
		catch (ArrayUtilsException e){
			e.printStackTrace();	
		}
		printArray(i);
		int index = binaryFind2(i,6,0,25);
		System.out.println(index); 
		
	}    
}