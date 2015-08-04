class MyExceptionDemo{


	public static void main(String[] args){    
	    try{
			int i = 0;
			int j = 10;
			int k = j / i;
			System.out.println(k); 
			
	    }
	    catch (Exception e){
			System.out.println("分母不能为零");
	    }
	}
}	
		


