package de.dhbw.tinf21b3.pattern.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Subjekt {

	private final List<Beobachter> angemeldeteBeobachter;
	
	public Subjekt() {
		super();
		this.angemeldeteBeobachter = new LinkedList<>();
	}
	
	public void meldeAn(Beobachter b) {
		this.angemeldeteBeobachter.add(b);
	}
	
	public void meldeAb(Beobachter b) {
		while (this.angemeldeteBeobachter.contains(b)) {
			this.angemeldeteBeobachter.remove(b);
		}
	}
	
	public void benachrichtige() {
		for (Beobachter each : this.angemeldeteBeobachter) {
			each.aktualisiere(gibZustand());
		}
	}
	
	public abstract String gibZustand();
}
