package kata;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

	@Test
	public void generate_one_returnsEmptyList() {
		assertEquals(new ArrayList<Integer>(), PrimeFactors.generate(1));
	}

}