class ExceptionTest{

	public static void main(String[] args){    
	    ExceptionTest et = new ExceptionTest();
		System.out.println(et.toString()); 
		et = null;
		System.out.println(et.toString());
		try{
			System.exit(0);
			et.a();
			System.out.println("正常"); 	
		}catch(MyException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			System.out.println("空指针异常");
		}finally{
			System.out.println("执行");
		}
	}
	
	
	public void a() throws MyException{
		//throw new MyException();  //抛出异常对象
	}
}

class MyException extends Exception{

}
			
			
		
		