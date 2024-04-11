package de.dhbw.tinf21b3.intro;

import java.util.List;

public class Main {

	public static void main(String[] arguments) {
		SchokoladenCookie schoki = new SchokoladenCookie();
		MacadamiaCookie queen = new MacadamiaCookie();
		
		schoki.klicke();
		queen.klicke();
		
		List<Cookie> meine = List.of(
			schoki,
			queen
		);
		meine.forEach(Cookie::klicke);
//		for (Cookie each : meine) {
//			each.klicke();
//		}
		
		Keksdose dose = new Keksdose();
		dose.legeRein(schoki);
		dose.legeRein(queen);
		meine.forEach(dose::legeRein);
//		for (Cookie each : meine) {
//			dose.legeRein(each);
//		}
	}
}
