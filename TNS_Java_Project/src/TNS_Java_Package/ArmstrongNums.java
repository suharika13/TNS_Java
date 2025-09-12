package TNS_Java_Package;

public class ArmstrongNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Armstrong numbers from 1 to 100 are:");
		 for (int num = 1; num <= 1000; num++) {
	            int originalNum = num;
	            int sum = 0;
	            int noDig = String.valueOf(num).length();  // number of digits
	            while (num > 0) {
	                int digit = num % 10;
	                sum += Math.pow(digit, noDig); // raise digit to the power of digits
	                num /= 10;
	            }
	            if (sum == originalNum) {
	                System.out.println(originalNum);
	            }
	            
	            num = originalNum; // reset num for next iteration
		 }
	}
}
