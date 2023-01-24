# Data Structures and Algorithms

> this repo contains Algorithms written in java

i code using eclipse IDE ! to install it => [Download](https://www.eclipse.org/downloads/)

## Examples

### Searching Algorithms:

> **Binary Search**

##### Binary Search is a searching algorithm for finding an element's position in a sorted array.

```java
public class BinarySearch {
	public static void main(String[] args) {
		 int array[] = new int[1000000];
		 int target = 77777;

		 for(int i = 0; i < array.length; i++) {
			 array[i] = i;
		 }

		 int index = binarySearch(array, target);
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
```

> **Linear Search**

##### Linear search is a sequential searching algorithm where we start from one end and check every element of the list until the desired element is found. It is the simplest searching algorithm.

```java
public class LinearSearch {

	public static void main(String[] args) {
		int[] array = { 9,1,8,5,4,7,6,4 };
		int index = linearSearch(array, 9);

		if(index != -1) {
			System.out.println("Element found at index " + index);
		}else {
			System.out.println("Element not found");
		}

	}

	private static int linearSearch(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
```

### Sorting Algorithms

> **Bubble Sort**

##### Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order.

```java

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

```

> **Quick Sort**

##### Quicksort is a sorting algorithm based on the divide and conquer approach where

- An array is divided into subarrays by selecting a pivot element (element selected from the array).
- While dividing the array, the pivot element should be positioned in such a way that elements less than pivot are kept on the left side and elements greater than pivot are on the right side of the pivot.
- The left and right subarrays are also divided using the same approach. This process continues until each subarray contains a single element.
- At this point, elements are already sorted. Finally, elements are combined to form a sorted array.

```java
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {8,2,5,3,9,4,7,6,1};

		quickSort(array, 0, array.length - 1);

		for(int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		if(end <= start) return;
		int pivot = partition(array, start, end);

		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start - 1;

		for(int j = start; j <= end - 1; j++) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;

		return i;
	}

}

```

#### you can explore more by cloning the file in your workspace by running

```bash
git clone https://github.com/oussamachah2020/DSA.git

cd DSA
```

### Documentation

> if you want to learn more i recommand this website
> [Documentation](https://www.programiz.com/dsa/algorithm)

> also you can watch this youtube video. which is my favorite
> [Video](https://youtu.be/CBYHwZcbD-s)

##### Happy Coding !!!
