package Array;

import java.util.Scanner;

public class removeElement {
	public static int removeElement(int[] nums, int val) {
        int slots = 0;
        for(int ele:nums){
            if(ele!=val){
                nums[slots]=ele;
                slots++;
            }
        }
        return slots;
    }
	public static void main(String []args) {
		int[] array= {0,1,3,3,4,6,7,6,5};
		//Print array using For-each loop
		System.out.print("The array contains : ");
		for(int e :array) {
			System.out.print(e+" ");
		}
		System.out.println("\nThe array size is : " + array.length);
		System.out.print("Enter element you want delete : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int size = removeElement(array,key);
		System.out.print("The new array size is : " + size +"\n The required array is : ");
		for(int i=0;i<size;i++) {
			System.out.print(" "+array[i]+" ");
		}
	}

}


