package de.dhbw.tinf21b3.pattern.memento;

public class Wetter {

	private final int temperatur;
	private final int luftdruck;
	
	public Wetter(int temperatur, int luftdruck) {
		super();
		this.temperatur = temperatur;
		this.luftdruck = luftdruck;
	}
	
	public int getTemperatur() {
		return temperatur;
	}
	
	public int getLuftdruck() {
		return luftdruck;
	}
}
