class NumberDemo{
	int i = 0;
	public static void main(String[] args)  { 
		int x[] = new int[100]; 
		for (int i = 0;i < x.length ;i++ ){
			x[i] = (int)(Math.random()*100);
		}

		for (int i = 0;i < x.length ;i++ ){
			System.out.println("[" + i + "] =" + x[i]);
		}
		for(int item:x){
			System.out.println("x = " + item);
		}
			
		int ix[] = new int[3];
			System.out.println(ix[0]);
		float fx[] = new float[3];
			System.out.println(fx[0]); 	
		double dx[] = new double[3];
			System.out.println(dx[0]);
		byte bx[] = new byte[3];
			System.out.println(bx[0]);
		boolean bbx[] = new boolean[3];
			System.out.println(bbx[0]);
		short sx[] = new short[3];
			System.out.println(sx[0]);
		long lx[] = new long[3];
			System.out.println(lx[0]);
		char cx[] = new char[3];
			System.out.println(cx[0]);
		String strx[] = new String[3];
			System.out.println(strx[0]);

		

	}
}