package de.dhbw.tinf21b3.pattern.singleton;

public enum CardPrinter {

	one(11) {
		@Override
		public int otherPort() {
			return 111;
		}
	},
	//two(22),
	//three(33),
	;
	
	private final int port;
	
	private CardPrinter(int port) {
		this.port = port;
	}
	
	public int getPort() {
		return port;
	}

	public abstract int otherPort();
}
