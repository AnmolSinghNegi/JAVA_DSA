package Array;
import java.util.Arrays;
import java.util.Scanner;
public class replaceElementswithGreatestelementOnrightSide {
	public static int[] input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int []array = new int[size];
		for(int index =0;index<size;index++) {
			System.out.print("Enter the first element of Array : ");
			array[index]=sc.nextInt();
		}
		return array;
	}
	public static void replace(int[]array) {
		if(array.length==0) {
			System.out.print("Array is empty");
		}
		else if(array.length==1) {
			array[0]=0;
			System.out.println("The required array is : "+Arrays.toString(array));
		}
		else {
			int size =array.length;
			int max = array[size-1];
			array[size-1]=0;
			for(int index=size-2;index>=0;index--) {
				int temp=array[index];
				array[index]=max;
				if(temp>max) {
					max=temp;
				}
			}
			System.out.print("The required array is : "+Arrays.toString(array));
		}
	}
	public static void main (String []args) {
		int []array=input();
		System.out.println("The provided array is : "+Arrays.toString(array));
		replace(array);
	}
}
