
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		bubbleSort(array);
		
		for(int i : array) {
			System.out.println(i);
		}
	}
	
	public static void bubbleSort(int[] array) {
		// TODO Auto-generated constructor stub
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
			
				}
			}
		}
	}

}
