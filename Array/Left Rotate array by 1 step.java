package Array_End;

import java.util.Arrays;

public class leftRotatearrayby1step {
	public static void lRby1(int []array) {
		int first = array[0];
		for(int i =0;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		array[array.length-1]=first;
		System.out.print(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7};
		lRby1(array);

	}

}
