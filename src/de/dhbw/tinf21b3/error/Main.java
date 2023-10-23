package de.dhbw.tinf21b3.error;

import java.io.IOException;
import java.util.Optional;

public class Main {

	public static void main(String[] arguments) throws IOException {
		//Datenbank db = new FunktionierendeDatenbank();
		//Datenbank db = new NichtErreichbareDatenbank();
		Datenbank db = new LeereDatenbank();
		
		Optional<Benutzer> maybeAdministrator = db.findeFür("admin");
		maybeAdministrator
			.map(b -> b.anzeigename())
			.ifPresentOrElse(
				System.out::println,
				() -> System.err.println("Nicht gefunden")
			);
		//System.out.println(administrator.anzeigename());
	}
}
