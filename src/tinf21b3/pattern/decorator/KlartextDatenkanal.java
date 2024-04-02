package tinf21b3.pattern.decorator;

public class KlartextDatenkanal implements Datenkanal {

	private int übertragen;
	
	public KlartextDatenkanal() {
		super();
		this.übertragen = 0;
	}
	
	@Override
	public int übertrageneZeichen() {
		return this.übertragen;
	}
	
	public void übertrage(String daten) {
		this.übertragen += daten.length();
		System.out.println(daten);
	}
}
