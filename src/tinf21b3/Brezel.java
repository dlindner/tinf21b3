package tinf21b3;

public class Brezel implements Backware {

	private String name;

	public Brezel(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String name() {
		return this.name;
	}
}
