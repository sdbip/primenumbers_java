package kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> generate(int n) {
		ArrayList<Integer> primes = new ArrayList<>();
		int prime = 2;
		while (n % prime == 0) {
			n /= prime;
			primes.add(prime);
		}
		if (n > 1) primes.add(n);
		return primes;
	}
}
