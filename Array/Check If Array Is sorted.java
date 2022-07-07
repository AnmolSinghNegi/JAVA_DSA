package Array;
import java.util.Arrays;
import java.util.Scanner;
public class checkIfarryIssorted {
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
	public static boolean isSorted(int[]array) {
		boolean isSorted =false;
		if(array.length==0){
			return false;
		}
		else if(array.length==1) {
			return true;
		}
		else {
		for(int index=0;index<array.length-1;index++) {
			if(array[index]<=array[index+1]) {
				isSorted=true;
			}
			else {
				isSorted=false;
				break;
			}
		}
		}
		return isSorted;
	}

	public static void main(String[] args) {
		int array[]=input();
		System.out.println("the provided array is : "+Arrays.toString(array));
		boolean Issorted = isSorted(array);
		if(Issorted==true) {
			System.out.print("The array is sorted");
		}
		else {
			System.out.print("The array is not in sorted order ");
		}
	}
}



