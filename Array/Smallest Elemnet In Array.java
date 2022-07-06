package Array;

public class smallestElemnetinArray {
	public static int smallestof(int[]array) {
		int min =-1;
		for(int ele:array) {
			if(min==-1||min>ele)
				min=ele;
		}
		return min;
	}
	public static void main(String args[]) {
		int []array = {1,44,56,7,0,9,12};
		System.out.print("The provided array is : [");
		for(int ele:array) {
			System.out.print(ele+" ");
		}
		System.out.println("]");
		int smallest = smallestof(array);
		System.out.print("The smallest element of array is : "+smallest);
	}

}
