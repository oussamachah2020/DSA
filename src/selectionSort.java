
public class selectionSort {

	public static void main(String[] args) {
		int array[] = {9,2,8,7,3,4,6,1};
	
		SelectionSort(array);
		
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long timeC = endTime - startTime;
		
		for(int i : array) {
			System.out.print("[" + i + "]");
		}
		System.out.println("\ntime => " + timeC);
	}

	private static void SelectionSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i; j < array.length; j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}

}
