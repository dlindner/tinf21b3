package de.dhbw.tinf21b3.error;

public class LeereDatenbank implements Datenbank {

	public LeereDatenbank() {
		super();
	}
	
	@Override
	public Benutzer findeFür(String login) {
		return null;
	}
}
