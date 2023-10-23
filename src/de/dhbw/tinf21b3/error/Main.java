package de.dhbw.tinf21b3.error;

public class Main {

	public static void main(String[] arguments) {
		Datenbank db = new FunktionierendeDatenbank();
		//Datenbank db = new NichtErreichbareDatenbank();
		//Datenbank db = new LeereDatenbank();
		
		Benutzer administrator = db.findeFür("admin");
		System.out.println(administrator.anzeigename());
	}
}
