package de.dhbw.tinf21b3.error;

import java.io.IOException;
import java.util.Optional;

public class NichtErreichbareDatenbank implements Datenbank {

	public NichtErreichbareDatenbank() {
		super();
	}
	
	@Override
	public Optional<Benutzer> findeFür(String login) throws IOException {
		throw new IOException("Netzkabel rein!");
	}
}
