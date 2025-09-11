package TNS_Java_Package;

public class Operators {
	static void Arithmetic(int num1, int num2, int num3, int num4) {
		System.out.println("Arithmetic Operator");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        System.out.println("Increment: " + (num1++));
        System.out.println("Decrement: " + (num3--));
	}
	
	static void Relational(int num1, int num2, int num3, int num4) {
		System.out.println("Relational Operator");
		System.out.println("Less than or equal(10,2): " + (num1 <= num2));
		System.out.println("Greater than or equal(10,2): " + (num1 >= num2));
		System.out.println("Equal(10,2): " + (num1 == num2));
		System.out.println("Not Equal(10,2): " + (num1 != num2));
	} 
	
	static void Logical(int num1, int num2, int num3, int num4) {
		System.out.println("Logical Operator");
		System.out.println("Logical And: " + (num1 == num2 && num3 >= num4));
	    System.out.println("Logical Or: " + (num1 != num2 || num4 <= num3));
	    System.out.println("Logical Not: " + (!(num2 == num4)));
	}
	
	static void Bitwise(int num1, int num2, int num4) {
		System.out.println("Bitwise Operator");
		System.out.println("Bitwise And: " + (num1 & num2));
	    System.out.println("Bitwise Or: " + (num1 | num2));
	    System.out.println("Bitwise XOR: " + ((num2 ^ num4)));
	    System.out.println("Bitwise left shift: " + (num1 << 2));
	    System.out.println("Bitwise Right shift: " + (num1 >> 2));
	}
	static void Assignment(int num1, int num2) {
		 System.out.println("Assignment Operators");
		 System.out.println("Addition Assignment: " + (num1 += 3));
		 System.out.println("Substraction Assignment: " + (num1 -= 2));
		 System.out.println("Multiplication Assignment: " + (num1 *= num2));
		 System.out.println("Division Assignment: " + (num1 /= num2));
		 System.out.println("Modulus Assignment: " + (num1 %= num2));
	}
	static void  Ternary(int num1, int num2) {
		System.out.println("Ternary Operator:");
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("max value by  Ternary: " + max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		int num3 = 9;
		int num4 = 3;
		
		//Arithmetic Operator
		Arithmetic(num1, num2, num3, num4);
		//Relational Operator
		Relational(num1, num2, num3, num4);
		//Logical Operator
		Logical(num1, num2, num3, num4);
		//Bitwise Operator
		Bitwise(num1, num2, num4);
		//Assignment Operator
		Assignment(num1, num2);
		// Ternary Operator
		Ternary(num1, num2);
	}
}
