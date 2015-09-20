package kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	public static List<Integer> generate(int n) {
		ArrayList<Integer> primes = new ArrayList<>();
		if (n % 2 == 0) {
			n /= 2;
			primes.add(2);
		}
		if (n > 1) primes.add(n);
		return primes;
	}
}
