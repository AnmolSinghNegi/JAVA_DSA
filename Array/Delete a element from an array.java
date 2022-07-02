package Array;
import java.util.Scanner;

public class Deleteele {
	public static int delete(int array[],int key) {
		int size = array.length;
		int i =0;
		for(;i<size;i++) {
			if(array[i]==key) {
				break;
			}
		}
		if(i ==size) return size;
		for(int j =i;j<size-1;j++) {
			array[j]=array[j+1];
		}
		return size-1;
	}
	public static void main(String []args) {
		int[] array= {0,1,2,3,4,6,7,6,5};
		//Print array using For-each loop
		System.out.print("The array contains : ");
		for(int e :array) {
			System.out.print(e+" ");
		}
		System.out.println("\nThe array size is : " + array.length);
		System.out.print("Enter element you want delete : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int size = delete(array,key);
		System.out.print("The new array size is : " + size +"\n The required array is : ");
		for(int i=0;i<size;i++) {
			System.out.print(" "+array[i]+" ");
		}
	}

}
