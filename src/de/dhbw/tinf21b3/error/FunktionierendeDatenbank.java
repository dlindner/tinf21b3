package de.dhbw.tinf21b3.error;

public class FunktionierendeDatenbank implements Datenbank {
	
	public FunktionierendeDatenbank() {
		super();
	}
	
	@Override
	public Benutzer findeFür(String login) {
		return new Benutzer() {
			@Override
			public String login() {
				return login;
			}
			
			@Override
			public boolean istAdministrator() {
				return true;
			}
			
			@Override
			public String anzeigename() {
				return "Geladener Benutzer";
			}
		};
	}
}
