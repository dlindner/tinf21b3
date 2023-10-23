package de.dhbw.tinf21b3.error;

import java.io.IOException;
import java.util.Optional;

public interface Datenbank {
	
	Optional<Benutzer> findeFür(String login) throws IOException;
}
