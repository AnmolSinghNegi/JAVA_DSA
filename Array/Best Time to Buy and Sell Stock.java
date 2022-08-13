package Array2;

public class bestTimetobuyStock {
	static int bestTimetobuyStock(int[]array) {
		int buy= Integer.MAX_VALUE;
		int sell=Integer.MIN_VALUE;
		for(int i =0;i<array.length;i++) {
			buy=Math.min(array[i], buy);
			sell=Math.max(sell, array[i]-buy);
		}
		return sell;
	}

	public static void main(String[] args) {
		int []array= {7,1,5,3,6,4};
		int sell =bestTimetobuyStock(array);
		System.out.print("Profit = " +sell);

	}

}
