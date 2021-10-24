package examples;
import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class PlayingWithJunit {

	@Test
	void testName() throws Exception {
		assertEquals(4, Calculator.add(2,2));
	}
}
