package Array;
import java.util.Arrays;
public class removeDuplicatefromSortedarray {
	public static int removeDuplicate(int[]array) {
		int j = 0;
		for(int index =1; index<array.length;index++) {
			if(array[j]!=array[index]) {
				j++;
				array[j]=array[index];
			}
		}
		return j+1;
	}
	public static void main(String args[]) {
		int []array = {2,2,3,4,4,7};
		System.out.println("The provided array is : "+Arrays.toString(array));
		int updatedsize=removeDuplicate(array);
		System.out.print("The updated array is : [" );
		for(int index =0; index<updatedsize;index++) {
			System.out.print(array[index]+" ");
		}
		System.out.print("]");
		
		
	}
}
