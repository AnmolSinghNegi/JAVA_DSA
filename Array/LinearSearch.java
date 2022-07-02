package Array;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size =sc.nextInt();
		int[]array= new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter "+(i+1)+" elemnt of the array : ");
			array[i]=sc.nextInt();
		}
		System.out.println("The provided array is : " +Arrays.toString(array));
		System.out.print("Enter the element you want to search in array : ");
		int element = sc.nextInt();
		int result = -1;
		//search element index
		for(int i =0;i<size;i++) {
			if(element==array[i]) {
				result=i;
				break;
			}
		}
		if(result==-1)
			System.out.println("The element = " +element+ "is unavailable in array");
		else
			System.out.println("The element = "+element+ " is available at "+result +" index");
		
	}

}
