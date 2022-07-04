/*Given an integer array nums of length n, you want to create an array 
 ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] 
 for 0 <= i < n (0-indexed).*/
package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationofArray {
	public static int[]input(){
		System.out.print("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []array = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter the "+(i+1)+" element of array : ");
			array[i]= sc.nextInt();
		}
		return array;
		
	}
	// Solution LeetCode Q .1929
	public static int[] getConcatenation(int[] nums) {
		int length = nums.length;
		int [] ans = new int[2*length];
		for(int index =0;index<length;index++) {
			ans[index]=ans[index+length]=nums[index];
		}
		return ans;
	}
	public static void main(String args[]) {
		int [] array = input();
		System.out.println("The given array is : "+Arrays.toString(array));
		int [] ans = getConcatenation(array);
		System.out.println("The concatenated array is : "+Arrays.toString(ans));
	}
}
