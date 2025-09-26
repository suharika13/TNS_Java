package array;
import java.util.Random;

public class twoDArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
        Random rand = new Random();

        // Fill the array with random numbers (1–100)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = rand.nextInt(100) + 1;  // random number between 1 and 100
            }
        }

        // Print the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] / 10 + " ");
            }
            System.out.println();
        }
    }
}