package de.dhbw.tinf21b3.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Wetterstation {
	
	private final List<Wetter> snapshots;
	private int temperatur;
	private int luftdruck;
	
	public Wetterstation() {
		super();
		this.snapshots = new ArrayList<>();
	}
	
	public Wetter saveToMemento() {
		Wetter result = new Wetter(temperatur, luftdruck);
		this.snapshots.add(result);
		return result;
	}
	
	public void restoreFromMemento(Wetter memento) {
		ändereTemperatur(memento.getTemperatur());
		ändereLuftdruck(memento.getLuftdruck());
	}
	
	public void ändereTemperatur(int neueTemperatur) {
		this.temperatur = neueTemperatur;
	}

	public void ändereLuftdruck(int neuerDruck) {
		this.luftdruck = neuerDruck;
	}

}
