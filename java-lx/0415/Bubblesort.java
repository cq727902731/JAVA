class Bubblesort{
	public static void bubble(int[] i){
		}
	public static void main(String[] args){
		int m[] = ArraySorter.productArray(10,100);
	    for (int i = 0;i < m.length - 1 ;i++ ){
			if (m[i] > m [i + 1]){
				int tmp = m[i];
				m[i] = m[i + 1];
				m[i + 1] = tmp;
			}
		}
		System.out.println("µ⁄“ª¥Œ≈≈–Ú"); 
		
		ArraySorter.printArray(m);
	}
}