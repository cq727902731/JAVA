public class people
{
	String name;//����
	String sex; //�Ա�

	public void sing(){
		System.out.println("�Ա�Ϊ"+sex+"����Ϊ"+this.name+"�������ڳ���");
	}
	public void eat(){
		System.out.println("�Ա�Ϊ"+sex+"����Ϊ"+this.name+"�������ڳԷ�");
	}
	
}
class peoplebh {

	public static void main(String[] args){
		people pb = new people();

		pb.name = "cq";
		pb.sex = "male";

		pb.sing();
		pb.eat();
	}
}