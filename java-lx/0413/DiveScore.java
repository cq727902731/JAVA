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
		System.out.println("请输入难度系数:");
	}*/	
	public void inputScore(){
		if (score != null){
			Scanner sc = new Scanner(System.in);
			for (int i = 0;i < score.length ;i++ ){
				System.out.println("请第" + (i + 1) + "位裁判给分"); 
				score[i] = sc.nextDouble();
			}
		}else{
			System.out.println("数组未初始化");
		}
	}
	public void calcScore(){
		
		int j = 0;
		double min = 0.0;
		double max = 0.0;
	 
		min = max = score[0];
		Scanner sc = new Scanner(System.in);
		System.out.println("数组Score的元素包括：");
		for(j = 0;j < score.length ; j++ ){
			System.out.print(score[j] + " ");
		    if(score[j] > max)   // 判断最大值
			max = score[j];
			if(score[j] < min)   // 判断最小值
			min = score[j];
		} 
		System.out.println("\n数组的最大值是：" + max); // 输出最大值
		System.out.println("数组的最小值是：" + min); // 输出最小值
		double total = 0;
		for (int m = 0;m < score.length ; m++ ){
			total = total + score[m];
		}
		System.out.println(total);
		System.out.println("请输入难度系数:");
		double y = sc.nextDouble();		
		System.out.println("最后的得分为：" + (total - max - min)*y*0.6);
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



	
		
