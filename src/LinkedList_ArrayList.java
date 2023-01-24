import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_ArrayList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		long startTime;
		long endTime;
		long elapsedTime;
		
		for(int i = 0; i < 1000000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
		
		// ************** LinkedList ****************
		startTime = System.nanoTime();
		
//		linkedList.get(0);
//		linkedList.get(999999);
		linkedList.remove(500000);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("LinkedList:\t" + elapsedTime + " ns");
		
		// ************** ArrayList ****************
		
		startTime = System.nanoTime();
		
//		arrayList.get(0);
//		arrayList.get(999999);
//		arrayList.remove(0);
		arrayList.remove(500000);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("arrayList:\t" + elapsedTime + " ns");
	}
}
