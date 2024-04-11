package de.dhbw.tinf21b3.principles.lsp;

import java.util.ArrayList;
import java.util.List;

public class WithLists {
	
	public static void main(String[] args) {
		List<Integer> fibonacci = new ArrayList<>();
		List.of(
		    1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		).forEach(fibonacci::add);
		Double pi = new Double(3.141592653589793238463D);
		
		List<Number> gehtdas = new ArrayList<>();
		gehtdas.add(pi);
		
		for (Number each : gehtdas) {
			//System.out.print(each + ", ");
		}
		List<? extends Object> dinge = fibonacci;
		List<? extends Number> numbers = fibonacci;
		List<? extends Number> numbers2 = new ArrayList<>();
		//Number someNumber = pi;
		
		List<? super Number> kontra = new ArrayList<>();
		kontra.add(pi);
		System.out.println(kontra);
		
		//numbers2.set(0, Integer.valueOf(3));
		numbers.set(0, pi);
		
		//numbers.set(1, someNumber);
		//numbers[0] = pi;
		
		//numbers[1] = someNumber;
		
		for (Integer each : fibonacci) {
			System.out.print(each + ", ");
		}
		
		System.out.println(numbers);
	}
}

