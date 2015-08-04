
import java.util.Random;

class Lottery{
	public static void main(String[] args){    
	    int iArray[] = new int [6];
		Random rand = new Random();
		
		for (int i = 0;i < iArray.length ;){
			int randNum = rand.nextInt(48) + 1;
			boolean flag = false;
			for (int j = 0;j < iArray.length - 1 ;j++){
				if(iArray[j] == randNum){
					flag = true;
					break;
			}
		}
		if (!flag){
			iArray[i] = randNum;
			i++;
		}
	}
		for(int i=0;i < iArray.length;i++){
			 System.out.print("\t" + iArray[i]);
		}
	}
}