package Array;

import java.util.Arrays;

public class thirdLargestelement {
	public static int thirdLargestof(int[]array) {
		int largest,second,third;
		largest=second=third =-1;
		for(int index =0;index<array.length;index++) {
			if(largest==-1||array[largest]<array[index]) {
				third=second;
				second=largest;
				largest=index;
			}
			else if(array[largest]>array[index]) {
				if(second==-1||array[second]<array[index]) {
					third=second;
					second=index;
				}
				else if(array[second]>array[index]) {
					if(third==-1||array[third]<array[index]) {
						third =index;
					}
				}
			}
	  }
		return third;
	}
	public static void main(String []args) {
		int []array= {2,55,67,8,0,12,3};
		System.out.println("The provided array is: "+Arrays.toString(array));
		int third = thirdLargestof(array);
		System.out.println("The third largest element of array : " +array[third]
				+" and it is present at "+third+" index");
	}

}
