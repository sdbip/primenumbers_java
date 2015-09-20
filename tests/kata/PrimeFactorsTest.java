package kata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

	@Test
	public void generate_one_returnsEmptyList() {
		assertEquals(new ArrayList<Integer>(), PrimeFactors.generate(1));
	}

	@Test
	public void generate_two_returnsTwo() {
		assertEquals(Collections.singletonList(2), PrimeFactors.generate(2));
	}

}