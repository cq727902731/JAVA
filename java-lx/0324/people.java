public class people
{
	String name;//姓名
	String sex; //性别

	public void sing(){
		System.out.println("性别为"+sex+"姓名为"+this.name+"的人正在唱歌");
	}
	public void eat(){
		System.out.println("性别为"+sex+"姓名为"+this.name+"的人正在吃饭");
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