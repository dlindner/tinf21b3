package de.dhbw.tinf21b3.principles.lsp;

public class WithArrays {
	
	public static void main(String[] args) {
		Integer[] fibonacci = new Integer[] {
		    1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
		};
		Double pi = new Double(3.141592653589793238463D);
		
		Number[] gehtdas = new Number[1];
		gehtdas[0] = pi;
		
		for (Number each : gehtdas) {
			System.out.print(each + ", ");
		}

		Number[] numbers = fibonacci;
		Number someNumber = pi;
		
		numbers[0] = pi;
		
		numbers[1] = someNumber;
		
		for (Integer each : fibonacci) {
			System.out.print(each + ", ");
		}
		
		System.out.println(numbers);
	}
}

