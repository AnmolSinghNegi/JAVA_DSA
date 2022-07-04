package Array;
/*Given a sorted array of distinct integers and a target value, 
 return the index if the target is found.
 If not, return the index where it would be if it were inserted in order.*/
import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertPosition {
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
	//Solution Search Insert Position
	  public static int searchInsert(int[] nums, int target) {
		  int result =-1;
		  int size= nums.length;
		  for(int index=0;index<size;index++) {
			  if(nums[index]==target) {
				  result = index;
				  break;
			  }
			  else {
				  if(nums[index]>target) {
					  result = index;
					  break;
				  }
				  else {
					  result = index+1;
				}
			  }
		  }
	     return result;   
	    }
	public static void main(String args[]) {
		int array[] =input();
		System.out.println("The given array is : "+Arrays.toString(array));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value whose position you want to : ");
		int target = sc.nextInt();
		int result =searchInsert(array,target);
		System.out.print("The insertion position should be : " + result);
	}
}
