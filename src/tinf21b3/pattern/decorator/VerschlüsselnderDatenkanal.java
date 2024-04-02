package tinf21b3.pattern.decorator;

import java.nio.charset.Charset;
import java.util.Base64;

public class VerschlüsselnderDatenkanal extends DatenkanalDekorierer {
	
	public VerschlüsselnderDatenkanal(
		Datenkanal nachfolger
	) {
		super(nachfolger);
	}
	
	@Override
	protected String zusatzfunktionalitätVorher(String daten) {
		return Base64.getEncoder().encodeToString(
			daten.getBytes(
				Charset.forName(
					"utf-8"
				)
			)
		);
	}
	
	@Override
	protected void zusatzfunktionalitätDanach(String bearbeitet) {
		System.out.println("Verschlüsselung: " + bearbeitet);
	}
}
