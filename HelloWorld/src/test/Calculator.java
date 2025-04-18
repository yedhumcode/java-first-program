package test;

public class Calculator {

	public static void calcu(int a, int b, String s) {
		if (s == "add") {
			int sum = a + b;
			System.out.println("Sum of "+a+" and "+b+" is "+sum);
		}else if (s == "substract") {
			int diff = a - b;
			System.out.println("Difference of "+a+" and "+b+" is "+diff);
		} else if (s == "multiply") {
			int mul = a * b;
			System.out.println("Product of "+a+" and "+b+" is "+mul);
		}else {
			float div = a / b;
			System.out.println("Division of "+a+" and "+b+" is "+div);
		}
	}

}
