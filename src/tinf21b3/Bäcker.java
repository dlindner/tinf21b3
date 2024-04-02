package tinf21b3;

import java.util.List;

public class Bäcker {

	public Bäcker() {
		super();
	}

	public List<Backware> backeAllesIn(
		Bäckerei bäckerei
	) {
		return List.of(
			bäckerei.backeBrot(),
			//bäckerei.backeBrot()
			bäckerei.backeBrezel()
		);
	}
}
