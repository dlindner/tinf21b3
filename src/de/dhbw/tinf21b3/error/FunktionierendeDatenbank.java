package de.dhbw.tinf21b3.error;

import java.util.Optional;

public class FunktionierendeDatenbank implements Datenbank {
	
	public FunktionierendeDatenbank() {
		super();
	}
	
	@Override
	public Optional<Benutzer> findeFür(String login) {
		return Optional.of(
			new Benutzer() {
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
			}
		);
	}
}
