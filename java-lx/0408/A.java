class A{
	int a;
	public void method(final int p1,int p2){
		int localV1 = 2;
		final int localV2 = 2;
		class B{
			int b1 = a;
			int b2 = p1;
			//int b3 = p2;
			//int b4 = localV1;
			int b5 = localV2;
		}
	}
}