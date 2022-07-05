package Array;

import java.util.Arrays;

public class largestElementinArray {
	public static int largestOf(int[]array) {
		int largestindex = 0;
		for(int index =1;index<array.length;index++) {
			if(array[largestindex]<array[index]) {
				largestindex = index;
			}
		}
		return largestindex;
	}
	public static void main (String args[]) {
		int []array = {4,1,7,2,3,2000};
		System.out.println("The provided array is : "+Arrays.toString(array));
		int index=largestOf(array);
		System.out.println("The largest element is "+array[index]+( " and its index is ")+index);
				
	}

}
