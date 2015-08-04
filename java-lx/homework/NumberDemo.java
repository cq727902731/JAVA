class NumberDemo{

public NumberDemo(int a,int b){
		System.out.println(Math.max(a,b));
	}
			
	public NumberDemo(double a1,double a2,double a3){
		double mul = a1 * a2 * a3;
		System.out.println("三个数的乘积为" + mul);	
	}
	public NumberDemo(String b1,String b2){
		String str1 = b1;
		String str2 = b2;
		if(str1.equals(str2)){
			System.out.println("第一个字符串与第二个相同");
	}else{
			System.out.println("第一个字符串与第二个不同");
		
			    
			
}
}
	public static void main(String[] args){
		new NumberDemo(23,56);
		new NumberDemo(3.4,6.5,8.9);
		new NumberDemo("cq","cq");
	}
	
	    
}

		    
		

