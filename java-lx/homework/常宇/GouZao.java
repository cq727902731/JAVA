class GouZao{
	int x,y;
	double i,j,k;
	String m,n;
	
	/*
	public GouZao(int x,int y,double i,double j,double k,String m,String n){
		this.x = x;
		this.y = x;
		this.i = i;
		this.j = j;
		this.k = k;
		this.m = m;
		this.n = n;
	
	}
	*/
	public  GouZao(int x,int y){
		if (x > y){
			System.out.println("�ϴ�����ǣ�" + x);
			
		}else {
			System.out.println("�ϴ�����ǣ�" + y);
		
		}
	}
	public  GouZao(double i,double j,double k){
		double mul = i * j *k;
		System.out.println("�������ĳ˻�Ϊ" + mul);
						
	}
	public  GouZao(String m,String n){
		String str1 = m;
		String str2 = n;
		if (str1 == str2){
			System.out.println("��һ���ַ����͵ڶ����ַ�����ͬ");
			 
		}else{
			System.out.println("��һ���ַ����͵ڶ����ַ�������ͬ");
			
		}
	}
	public static void main(String[] args){
	    GouZao gz1 = new GouZao(32,48);
		GouZao gz2 = new GouZao(3.5,4.0,2.3);
		GouZao gz3 = new GouZao("abc","adc");
		/*
		gz.x = 32;
		gz.y = 48;
		gz.i = 3.5;
		gz.j = 4.0;
		gz.k = 2.3;
		gz.m ="abc";
		gz.n ="abc";
		*/	
	}	
}