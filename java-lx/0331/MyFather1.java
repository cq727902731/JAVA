class MyFather2 extends MyFather1{
	static{
		System.out.println("MyFather2 static");
	}
	{
		System.out.println("231321"); 
	}
	public MyFather2(int i){
		System.out.println("MyFather2");
	}
}
class MyFather1 extends MyFather2{
	static{
		System.out.println("MyFather1 static");
	}
	{
		System.out.println("23131"); 
	}
	public MyFather1(int i){
		System.out.println("MyFather1");
	}
}
class Mysub1 extends MyFather1{
	static{
		System.out.println("MySub1 static");
	}
	{
		System.out.println("221321"); 
	}
	public MySub1(int i){
		System.out.println("MySub1");
	}
}
		
		
		
class Demo{
	public static void main(String[] args){    
	    
}