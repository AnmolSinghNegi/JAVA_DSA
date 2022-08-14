package Array_End;

import java.util.Arrays;

public class rightRotatearraybykstep {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7};
		int k =1000;
		rRbyk(array,k);
		System.out.print(Arrays.toString(array));
	}
	static void rRbyk(int[]array,int k) {
		int len = array.length-1;
		k=k%array.length;
		reverse(array,0,len);
		reverse(array,0,k-1);
		reverse(array,k,len);
	}
	static void reverse(int[] array, int start,int end) {
		while(start<end) {
			int temp = array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
	}

}
