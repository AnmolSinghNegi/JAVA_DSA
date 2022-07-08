package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class leadersInarray {
	public static int[] input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int []array = new int[size];
		for(int index =0;index<size;index++) {
			System.out.print("Enter the "+(index+1)+" element of Array : ");
			array[index]=sc.nextInt();
		}
		sc.close();
		return array;
	}
	static void leaders(int[]array) {
		int largest = Integer.MIN_VALUE;
		int size = array.length;
		int j=0;
		int []array2 = new int[size];
		for(int i =size-1;i>=0;i--) {
			if(largest<array[i]) {
				largest = array[i];
				array2[j++]=array[i];
			}
		}
		System.out.print("The leaders in array are : ");
		for(j--;j>=0;j--) {
			System.out.print(array2[j]+" ");
		}
	}

	public static void main(String[] args) {
		int []array=input();
		System.out.println("The provided array is : "+Arrays.toString(array));
		leaders(array);
	}

}
