package Array2;

import java.util.Arrays;

public class moveAll0 {

	static void moveAll0(int[]array){
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				array[count++]=array[i];
			}
		}
		while (count<array.length)
			array[count++]=0;
		System.out.print(Arrays.toString(array));
	}
	public static void main(String[] args) {
		int []array= {8,0,1,3,0,0,5};
		moveAll0(array);
	}

}
