import java.util.Arrays;

class ArraySorter{

	public static void main(String[] args){
		ArraySorter as = new ArraySorter();
		int[] m = as.productArray(15,20);
		int[] tmp = new int[m.length];
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			tmp[count] = m[i];
			for (int j = 0; j < count; j++) {
				if (tmp[j] == tmp[count]) {
				count--;
				break;
			}
		}
		 count++;
	}
	int[] dest = new int[count];
	Arrays.sort(dest);
		//排序

		/*for (int i = 0;i < m.length ;i++ ){
			for (int j = m.length - 1 ;j > i ;j-- ){
				if (m[j] < m [j - 1]){
					int tmp = m[j];
					m[j] = m[j - 1];
					m[j - 1] = tmp;
				}
			}			
		}
		System.out.println("********排序********");
		//选择排序
		/*System.out.println("选择排序之后最小的数");
		for (int j = 0; j < m.length ;j++ ){
			int minIndex = j;//将当前下标定义为最小值
			for (int i = j + 1;i < m.length ;i++ ){
				if (m[minIndex] > m[i]){
					minIndex = i;
				}
			}
			if(minIndex != j){
				int tmp = m[j];
				m[j] = m[minIndex];
				m[minIndex] = tmp;
			}


		}*/		
		as.printArray(m);
	}
	public static int[] productArray(int arrayLen,int arrayScope){
		int[] i = new int[arrayLen];
		for (int j = 0;j < arrayLen ;j++ ){
			i[j] = (int)(Math.random() * arrayScope);
		}
		return i;
	}
	public static void printArray(int i[]){
		int index = 0;
		for (int j : i ){
			System.out.print("\t" + j);
		}
	}
}
