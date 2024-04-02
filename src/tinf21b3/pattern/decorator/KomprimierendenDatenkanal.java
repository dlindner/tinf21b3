package tinf21b3.pattern.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.zip.GZIPOutputStream;

public class KomprimierendenDatenkanal extends DatenkanalDekorierer {

	public KomprimierendenDatenkanal(Datenkanal nachfolger) {
		super(nachfolger);
	}
	
	@Override
	protected String zusatzfunktionalitätVorher(String daten) {
		try (
			final ByteArrayOutputStream bytes = new ByteArrayOutputStream();	
			final GZIPOutputStream zipping = new GZIPOutputStream(bytes);
		) {
			zipping.write(
				daten.getBytes(
					Charset.forName(
						"utf-8"
					)
				)
			);
			return bytes.toString(
				Charset.forName(
					"utf-8"
				)
			);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
	
	@Override
	protected void zusatzfunktionalitätDanach(String bearbeitet) {
		System.out.println("Komprimierung: " + bearbeitet);
	}
}
