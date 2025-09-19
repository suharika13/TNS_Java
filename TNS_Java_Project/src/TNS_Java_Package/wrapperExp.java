package TNS_Java_Package;

public class wrapperExp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		Integer i1 = i; //Auto boxing
		int i2 = i1;    //Auto unboxing
		System.out.println("Integer:");
		System.out.println("Autoboxing of int type: " + i1);		
		System.out.println("Autounboxing of Integer class: " + i2);
		
		byte b = 1;
		Byte b1 = b; //Auto boxing
		byte b2 = b1; //Auto unboxing
		System.out.println("Byte:");
		System.out.println("Autoboxing of byte type: " + i1);		
		System.out.println("Autounboxing of Byte class: " + i2);
		
		short s = 12;
		Short s1 = s; //Auto boxing
		short s2 = s1; //Auto unboxing
		System.out.println("Short:");
		System.out.println("Autoboxing of short type: " + i1);		
		System.out.println("Autounboxing of Short class: " + i2);
		
		long l = 123;
		Long l1 = l; //Auto boxing
		long l2 = l1; //Auto unboxing
		System.out.println("Long:");
		System.out.println("Autoboxing of long type: " + i1);		
		System.out.println("Autounboxing of long class: " + i2);
		
		float f = 12.9f;
		Float f1 = f; //Auto boxing
		float f2 = f1; //Auto unboxing
		System.out.println("Float:");
		System.out.println("Autoboxing of float type: " + i1);		
		System.out.println("Autounboxing of Float class: " + i2);
		
		double d = 12.96;
		Double d1 = d; //Auto boxing
		double d2 = d1; //Auto unboxing
		System.out.println("Double:");
		System.out.println("Autoboxing of double type: " + i1);		
		System.out.println("Autounboxing of Double class: " + i2);
		
		char c = 'r';
		Character c1 = c; //Auto boxing
		char c2 = c1; //Auto unboxing
		System.out.println("Character:");
		System.out.println("Autoboxing of char type: " + i1);		
		System.out.println("Autounboxing of Character class: " + i2);
		
		boolean n = true;
		Boolean n1 = n; //Auto boxing
		boolean n2 = n1; //Auto unboxing
		System.out.println("Boolean :");
		System.out.println("Autoboxing of boolean type: " + i1);		
		System.out.println("Autounboxing of Boolean class: " + i2);
	}

}
