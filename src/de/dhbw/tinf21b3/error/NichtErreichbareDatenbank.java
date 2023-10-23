package de.dhbw.tinf21b3.error;

public class NichtErreichbareDatenbank implements Datenbank {

	public NichtErreichbareDatenbank() {
		super();
	}
	
	@Override
	public Benutzer findeFür(String login) {
		return null;
	}
}
