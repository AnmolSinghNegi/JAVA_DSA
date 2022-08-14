package Array2;
public class splitArrayinThreeequalsumSubarrays {
	static boolean split(int []array) {
		    int l = array.length;int sum=0;
		    for(int i=0; i<l; i++){
		        sum = sum + array[i];  
		    }
		    if(sum%3 != 0)
		        return false;
		    int sum1 = sum/3;int count = 0;int sumarr = 0;
		    for(int j=0;j<l;j++){
		        sumarr += array[j];
		      if(sum1 == sumarr){ 
		          count++;
		          sumarr = 0;
		      } 
		    }
		    if(count >= 3)
		        return true;
		    else
		        return false;
	}

	public static void main(String[] args) {
		int []array= {1,1,1,3,2,1};
		System.out.print(split(array));

	}

}
