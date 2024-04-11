package de.dhbw.tinf21b3.pattern.observer;

public class VerdrehterBeobachter implements Beobachter {
	
	public VerdrehterBeobachter() {
		super();
	}
	
	@Override
	public void aktualisiere(String neuerZustand) {
		System.out.println(
			new StringBuilder(neuerZustand).reverse().toString()	
		);
	}
}
