package array;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] ar = {
	            {1, 2},        // row 1
	            {4, 5, 6, 7},  // row 2
	            {3, 8, 9}      // row 3
	        };

	        // Print using nested for-each loop
	        for (int[] row : ar) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	}    
	
}
