package de.dhbw.tinf21b3.pattern.observer;

public class KonkretesSubjekt extends Subjekt {
	
	private String subjektZustand;
	
	public KonkretesSubjekt() {
		super();
		this.subjektZustand = "";
	}
	
	@Override
	public String gibZustand() {
		return subjektZustand;
	}
	
	public void ändereZustandAuf(String neu) {
		this.subjektZustand = neu;
		benachrichtige();
	}
}
