class NumberDemo{

public NumberDemo(int a,int b){
		System.out.println(Math.max(a,b));
	}
			
	public NumberDemo(double a1,double a2,double a3){
		double mul = a1 * a2 * a3;
		System.out.println("�������ĳ˻�Ϊ" + mul);	
	}
	public NumberDemo(String b1,String b2){
		String str1 = b1;
		String str2 = b2;
		if(str1.equals(str2)){
			System.out.println("��һ���ַ�����ڶ�����ͬ");
	}else{
			System.out.println("��һ���ַ�����ڶ�����ͬ");
		
			    
			
}
}
	public static void main(String[] args){
		new NumberDemo(23,56);
		new NumberDemo(3.4,6.5,8.9);
		new NumberDemo("cq","cq");
	}
	
	    
}

		    
		

