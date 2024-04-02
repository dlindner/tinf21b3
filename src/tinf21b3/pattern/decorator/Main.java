package tinf21b3.pattern.decorator;

public class Main {

	public static void main(String[] args) {
		Datenkanal kern = new VerrauschtenDatenkanal();
		VerschlüsselnderDatenkanal ersteSchicht = new VerschlüsselnderDatenkanal(kern);
		VerschlüsselnderDatenkanal zweiteSchicht = new VerschlüsselnderDatenkanal(ersteSchicht);
		KomprimierendenDatenkanal dritteSchicht = new KomprimierendenDatenkanal(zweiteSchicht);
		
		Datenkanal äußersteSchicht = dritteSchicht;
		
		äußersteSchicht.übertrage("Hello, Hello TINF21B3");
		System.out.println("---- " + äußersteSchicht.übertrageneZeichen());
	}
}
