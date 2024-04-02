package tinf21b3;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BäckerTest {

	@Test
	void bäckt_volles_Sortiment() {
		// Arrange
		Bäckerei given = Mockito.mock(Bäckerei.class);
		//Brot knetenBrot = Mockito.mock(Brot.class);
		//Mockito.when(given.backeBrot()).thenReturn(knetenBrot);
		Mockito.when(given.backeBrot()).thenReturn(new Brot("Mock-Brot"));
		Mockito.when(given.backeBrezel()).thenReturn(new Brezel("Mock-Brezel"));
		//Mockito.when(given.backeBrezel()).thenThrow(new EnergyException());
		//Mockito.replay(given); <-- nur implizit
		
		//Bäckerei given = new Bäckerei();
		
		Bäcker target = new Bäcker();
		
		// Act
		List<Backware> actual = target.backeAllesIn(given);
		
		// Assert
		Assert.assertTrue(actual.size() == 2);
		//Mockito.verify(given, Mockito.never()).backeBrezel();
		//Mockito.verify(given, Mockito.times(1)).backeBrot();
		
		// debug
		actual.forEach(ware -> System.out.println(ware.name()));
	}
}
