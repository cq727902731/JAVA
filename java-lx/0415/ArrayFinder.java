import java.util.Random;

class ArrayFinder{
	public static void main(String[] args){    
	    int iArray[] = new int [15];
		Random rand = new Random();
		
		for (int i = 0;i < iArray.length ;){
			int randNum = rand.nextInt(20) + 1;
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
	Bubblesort.bubble(iArray);
	ArraySorter.printArray(iArray);
	}
}