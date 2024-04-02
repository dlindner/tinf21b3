package tinf21b3;

public class Bäckerei {

	public Bäckerei() {
		super();
		System.out.println("Das kostet 1M EUR an Baukosten");
	}
	
	public Brot backeBrot() {
		System.out.println("Das kostet uns 10 EUR an Energiekosten");
		return new Brot("DHBW-Bäck-Brot");
	}
	
	public Brezel backeBrezel() {
		System.out.println("Das kostet uns 5 EUR an Energiekosten");
		return new Brezel("DHBW-Bäck-Brezel");
	}
}
