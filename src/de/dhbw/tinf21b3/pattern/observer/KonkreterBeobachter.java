package de.dhbw.tinf21b3.pattern.observer;

public class KonkreterBeobachter implements Beobachter {
	
//	private final Subjekt subjekt;
	
	public KonkreterBeobachter(/*Subjekt subjekt*/) {
		super();
//		this.subjekt = subjekt;
	}
	
	@Override
	public void aktualisiere(String neuerZustand) {
		System.out.println(
			neuerZustand
		);
	}
}
