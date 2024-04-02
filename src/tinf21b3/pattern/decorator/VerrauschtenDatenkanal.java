package tinf21b3.pattern.decorator;

import java.util.Random;

public class VerrauschtenDatenkanal implements Datenkanal {
	
	private final Random rng;
	private int übertragen;
	
	public VerrauschtenDatenkanal() {
		super();
		this.übertragen = 0;
		this.rng = new Random();
	}
	
	@Override
	public void übertrage(String daten) {
		char[] zeichen = daten.toCharArray();
		for (char each : zeichen) {
			System.out.print(each);
			for (int i = 0; i < rng.nextInt(5); i++) {
				System.out.print('.');
			}
		}
		System.out.println();
		this.übertragen += zeichen.length;
	}
	
	@Override
	public int übertrageneZeichen() {
		return this.übertragen;
	}
}
