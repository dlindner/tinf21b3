package tinf21b3;

public class Brot implements Backware {

	private String name;

	public Brot(String name) {
		super();
		System.out.println("Das verbraucht 2 kg Mehl!");
		this.name = name;
	}
	
	@Override
	public String name() {
		return this.name;
	}
}
