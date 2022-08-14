package Array_End;

import java.util.Arrays;

public class leftRotatearraybykstep {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7};
		int k =3;
		lRbyk(array,k);
		System.out.print(Arrays.toString(array));
	}
	static void lRbyk(int[]array,int k) {
		int len = array.length-1;
		k=k%array.length;
		reverse(array,0,len);
		reverse(array,array.length-k,len);
		reverse(array,0,k);
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