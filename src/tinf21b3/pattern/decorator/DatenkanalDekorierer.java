package tinf21b3.pattern.decorator;

public abstract class DatenkanalDekorierer implements Datenkanal {

	private final Datenkanal nachfolger;

	public DatenkanalDekorierer(
		Datenkanal nachfolger
	) {
		super();
		this.nachfolger = nachfolger;
	}
	
	@Override
	public void übertrage(String daten) {
		String bearbeitet = zusatzfunktionalitätVorher(daten);
		this.nachfolger.übertrage(bearbeitet);
		zusatzfunktionalitätDanach(bearbeitet);
	}
	
	protected abstract String zusatzfunktionalitätVorher(String daten);

	protected abstract void zusatzfunktionalitätDanach(String bearbeitet);

	@Override
	public int übertrageneZeichen() {
		return this.nachfolger.übertrageneZeichen();
	}
}
