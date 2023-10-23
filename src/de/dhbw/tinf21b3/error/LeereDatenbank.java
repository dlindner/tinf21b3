package de.dhbw.tinf21b3.error;

import java.util.Optional;

public class LeereDatenbank implements Datenbank {

	public LeereDatenbank() {
		super();
	}
	
	@Override
	public Optional<Benutzer> findeFür(String login) {
		return Optional.empty();
	}
}
