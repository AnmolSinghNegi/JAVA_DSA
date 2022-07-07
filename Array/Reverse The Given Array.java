package Array;

import java.util.Arrays;
import java.util.Scanner;

public class reverseThegivenArray {
	public static int []input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int []array = new int[size];
		for(int index =0;index<size;index++) {
			System.out.print("Enter the "+(index+1)+" element of array : ");
			array[index]=sc.nextInt();
		}
		return array;
		
	}
	public static void reverse(int[]array) {
		if(array.length==0) {
			System.out.print("Array is empty");
		}
		else if(array.length==1) {
			System.out.print("The reverse of given array is : "+array[0]);
		}
		else {
		int size =array.length-1;
		for(int index=0;index<array.length-1;index++) {
			int temp = array[index];
			array[index]=array[size-index];
			array[size-index]=temp;
		}
		System.out.print("The reverse of given array is : "+Arrays.toString(array));
	  }
	}
	public static void main(String[] args) {
		int array[] = input();
		System.out.println("The provided array is : "+Arrays.toString(array));
		reverse(array);

	}

}
