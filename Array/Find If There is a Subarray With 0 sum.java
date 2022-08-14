package Array2;

import java.util.HashSet;
import java.util.Set;

public class findIfthereisAsubarrayWith0sum {
	static boolean checkzeroSum(int[]array){
		Set <Integer>set = new HashSet<>();
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}

	public static void main(String[] args) {
		int []array= {2,3,1,-4,3,-2};
		boolean checker =checkzeroSum(array);
		System.out.print(checker);

	}

}
