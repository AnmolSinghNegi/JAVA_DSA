package Array;

import java.util.Arrays;

public class secondLargestelement {
	public static int secondLargest(int[]array) {
		if(array.length == 0) {
			return -1;
		}
		if(array.length < 2)return -1;
		int largest = 0;
		int second= -1;
		for(int index = 1;index < array.length;index++) {
			if(array[largest]<array[index]) {
				second = largest;
				largest = index;
			}
			else if(array[largest]>array[index]) {
				if(second==-1||array[second]<array[index]) {
					second = index;
				}
			}
		}
		return second;
	}
	public static void main(String args[]) {
		int []array = {5,1,7,2,4,6};
		System.out.println("The provided array is : "+Arrays.toString(array));
		int secondlargest = secondLargest(array);
		if(secondlargest != -1)
		System.out.println("The second largest elemnt "+array[secondlargest]
				+ " and it is present at "+secondlargest+" index" );
		
	}
}
