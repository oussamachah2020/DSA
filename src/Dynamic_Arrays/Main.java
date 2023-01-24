package Dynamic_Arrays;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray dynamicArray = new DynamicArray(5);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");
		
//		dynamicArray.insert(0, "X");
		dynamicArray.delete("A");
		dynamicArray.delete("B");
		dynamicArray.delete("C");
		
//		System.out.println(dynamicArray.search("X"));
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("Empty: " + dynamicArray.isEmpty());
	}

}
