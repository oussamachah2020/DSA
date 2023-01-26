
public class BinarySearch {
	public static void main(String[] args) {
		 int array[] = new int[1000000];
		 int target = 77777;
		 
		 for(int i = 0; i < array.length; i++) {
			 array[i] = i;
		 }
		 
		binarySearch(array, target);
	}

	private static int binarySearch(int[] array, int target) {

		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			int middle = low + (high - low) / 2;
			int value = array[middle];
			
			System.out.println("middle: " + value);
			
			if(value < target) low = middle + 1;
			else if(value > target) high = middle - 1;
			else return middle;
		}
		
		return -1;
	}
}
