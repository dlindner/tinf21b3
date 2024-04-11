package de.dhbw.tinf21b3.pattern.observer;

public class Main {

	public static void main(String[] args) {
		KonkretesSubjekt ks = new KonkretesSubjekt();
		KonkreterBeobachter kb = new KonkreterBeobachter(/*ks*/);
		VerdrehterBeobachter vb = new VerdrehterBeobachter();
		
		ks.meldeAn(vb);
		ks.meldeAn(vb);
		
		ks.ändereZustandAuf("Erster!");
		
		ks.meldeAn(kb);
		
		ks.ändereZustandAuf("Jetzt neu!");
		
		ks.meldeAb(kb);
		ks.meldeAb(vb);
		
		ks.ändereZustandAuf("Noch neuer!");
	}
}
