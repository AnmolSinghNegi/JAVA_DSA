package MatrixDSA;

import java.util.Arrays;

public class transposeOfMatrix {
	static void transpose(int matrix[][]) {
		int size = matrix.length;
		for(int i=0;i<size;i++){
			for(int j=i;j<size;j++) {
				int swap = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=swap;
			}
		}
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<size;i++){    
		for(int j=0;j<size;j++){    
		System.out.print(matrix[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
	}

	public static void main(String[] args) {
		int [][]matrix= {{1,2,3},{4,5,6},{7,8,9}};
		transpose(matrix);
		

	}

}
