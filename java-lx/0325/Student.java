class Student{

	String sNo;//ѧ��
	String sName;//����	
	String sSex;//�Ա�
	int sAge;//����
	double sJava;//java�γ̵ĳɼ�

	public String getNo(){
		return sNo;
	}
	public String getName(){
		return sName;
	}
	public String getSex(){
		return sSex;
	}
	public int getAge(){
		return sAge;
	}
	public double getJava(){
		return sJava;
	}
	
}
class Test{

	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		s1.sNo = "1";
		s1.sName =  "������";
		s1.sSex = "��";
		s1.sAge = 23;
		s1.sJava = 90;
		System.out.println("ѧ��:" + s1.sNo + "\n����:" + s1.sName + "\n�Ա�:" + s1.sSex + "\n����:" + s1.sAge + "\n�ɼ�:" + s1.sJava);

		s2.sNo = "2";
		s2.sName = "����";
		s2.sSex = "��";
		s2.sAge = 18;
		s2.sJava = 88;
		System.out.println("ѧ��:" + s2.sNo + "\n����:" + s2.sName + "\n�Ա�:" + s2.sSex + "\n����:" + s2.sAge + "\n�ɼ�:" + s2.sJava);

		s3.sNo = "3";
		s3.sName =  "����";
		s3.sSex = "��";
		s3.sAge = 23;
		s3.sJava = 86;
		System.out.println("ѧ��:" + s3.sNo + "\n����:" + s3.sName + "\n�Ա�:" + s3.sSex + "\n����:" + s3.sAge + "\n�ɼ�:" + s3.sJava);

		s4.sNo = "4";
		s4.sName =  "������";
		s4.sSex = "Ů";
		s4.sAge = 22;
		s4.sJava = 87;
		System.out.println("ѧ��:" + s4.sNo + "\n����:" + s4.sName + "\n�Ա�:" + s4.sSex + "\n����:" + s4.sAge + "\n�ɼ�:" + s4.sJava);

		s5.sNo = "5";
		s5.sName =  "��ǿ";
		s5.sSex = "��";
		s5.sAge = 24;
		s5.sJava = 89;
		System.out.println("ѧ��:" + s5.sNo + "\n����:" + s5.sName + "\n�Ա�:" + s5.sSex + "\n����:" + s5.sAge + "\n�ɼ�:" + s5.sJava);

		double average = (s1.sJava + s2.sJava + s3.sJava + s4.sJava + s5.sJava)/5;
			System.out.println("���ѧ����ƽ����Ϊ:" + average);

		Student max = s1;
		if (s1.sJava < s2.sJava){
			max = s2;
		}if (max.sJava < s3.sJava){
			max = s3;
		}if (max.sJava < s4.sJava){
			max = s4;
		}if (max.sJava < s5.sJava){
			max = s5;
		}
		System.out.println("��߷�Ϊ:" + "ѧ��:" + max.sNo + "\t����:" + max.sName + "\t�Ա�:" + max.sSex + "\t����:" + max.sAge + "\t�ɼ�:" + max.sJava);

		Student min = s1;
		if (s1.sJava > s2.sJava){
			min = s2;
		}if (min.sJava > s3.sJava){
			min = s3;
		}if (min.sJava > s4.sJava){
			min = s4;
		}if (min.sJava > s5.sJava){
			min = s5;
		} 
		System.out.println("��ͷ�Ϊ:" + "ѧ��:" + min.sNo + "\t����:" + min.sName + "\t�Ա�:" + min.sSex + "\t����:" + min.sAge + "\t�ɼ�:" + min.sJava);
		
		}
	}	
