package Array2;

import java.util.Scanner;

public class majorityElement {
	public static int[]input(){
		System.out.print("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []array = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter the "+(i+1)+" element of array : ");
			array[i]= sc.nextInt();
		}
		sc.close();
		return array;
	}
	public static int majorityElement(int[] nums) {
		int count=0,ans=0;
		for(int ele:nums) {
			if(count==0)
				ans=ele;
			if(ele==ans) {
				count++;
			}
			else
				count--;
		}
		return ans;
	}
	public static void main(String[] args) {
		int []array =input();
		int majority=majorityElement(array);
		System.out.print("The majority element is : "+majority);
		
	}

}
