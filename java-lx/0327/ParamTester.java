class ParamTester{
	public int memberVariable = 0;

	public static void main(String[] args){

		int param1 = 0;//param1是基本数据类型
		ParamTester param2 = new ParamTester();//param2是对象引用类型
		ParamTester param3 = new ParamTester();//param3是对象引用类型
		int[] param4 = {0};//数组引用类型
		changeParameter(param1,param2,param3,param4);
		System.out.println("param1 =" + param1);
		System.out.println("param2.memberVariable = " + param2.memberVariable);
		System.out.println("param3.memberVariable = " + param3.memberVariable);
		System.out.println("param4[0] = " + param4[0]);
	}
	public static void changeParameter(int param1,ParamTester param2,ParamTester param3,int[] param4){
		param1 = 1;//改变基本数据类型参数的值
		param2.memberVariable = 1;//改变对象类型参数的实际变量
		param3 = new ParamTester();//改变对象类型参数的引用，使他引用一个新的对象
		param3.memberVariable = 1;//改变新的对象的实际变量
		param4[0] = 1;//改变数组类型参数的元素
	}
}