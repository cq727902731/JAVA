import java.util.Scanner;


class DiveScore{
	double[] score;
	public DiveScore(){
		score = new double[7];
	}
	public DiveScore(int i){
		score = new double[i];
	}
	/*public double dodScore(){
	}
	public double dodScore(){
		dodScore dods = new dodScore();
		System.out.println("�������Ѷ�ϵ��:");
	}*/	
	public void inputScore(){
		if (score != null){
			Scanner sc = new Scanner(System.in);
			for (int i = 0;i < score.length ;i++ ){
				System.out.println("���" + (i + 1) + "λ���и���"); 
				score[i] = sc.nextDouble();
			}
		}else{
			System.out.println("����δ��ʼ��");
		}
	}
	public void calcScore(){
		
		int j = 0;
		double min = 0.0;
		double max = 0.0;
	 
		min = max = score[0];
		Scanner sc = new Scanner(System.in);
		System.out.println("����Score��Ԫ�ذ�����");
		for(j = 0;j < score.length ; j++ ){
			System.out.print(score[j] + " ");
		    if(score[j] > max)   // �ж����ֵ
			max = score[j];
			if(score[j] < min)   // �ж���Сֵ
			min = score[j];
		} 
		System.out.println("\n��������ֵ�ǣ�" + max); // ������ֵ
		System.out.println("�������Сֵ�ǣ�" + min); // �����Сֵ
		double total = 0;
		for (int m = 0;m < score.length ; m++ ){
			total = total + score[m];
		}
		System.out.println(total);
		System.out.println("�������Ѷ�ϵ��:");
		double y = sc.nextDouble();		
		System.out.println("���ĵ÷�Ϊ��" + (total - max - min)*y*0.6);
	}
}

	/*public double calcScore(){
		int i = 0;
		double max1 = 0.0;
		double min1 = 0.0;
		this.length = score.length;
		this.pscore = score;
 
		this.max1 = pscore[0];
		this.min1 = pscore[0];         
		}
		public double max(){ 
			for (int i = 0;i < score.length ;i++){
			if (max1 < pscore[i]) max1 = pscore[i];  
			}
			return max1;
		}
		public double min(){ 
			for (int i = 0;i < score.length ;i++){
			if (min1 > pscore[i]) min1 = pscore[i];  
			}
			return min1;
		} 
		public double total(){
			double total=0.0;
			for(int i = 0;i < score.length ;i++){
			total += pscore[i];
			}
			total = total - (min() + max());
			return total;
		}*/
class FinalScore{
	public static void main(String[] args){    
	    DiveScore ds = new DiveScore(7);
		ds.inputScore();
		ds.calcScore();
	}
}



	
		
