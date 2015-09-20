package kata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static kata.PrimeFactors.*;
import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

	@Test
	public void generate_one_returnsEmptyList() {
		assertEquals(Collections.emptyList(), generate(1));
	}

	@Test
	public void generate_two_returnsTwo() {
		assertEquals(Collections.singletonList(2), generate(2));
	}

	@Test
	public void generate_three_returnsThree() {
		assertEquals(Collections.singletonList(3), generate(3));
	}

	@Test
	public void generate_four_returnsTwoTwo() {
		assertEquals(Arrays.asList(2, 2), generate(4));
	}

}