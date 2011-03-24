import java.util.ArrayList;

public class PrimeFactorization {

	public static ArrayList<Integer> GetPrimeFactors(int num) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int candidate = 2; num > 1; candidate++)
		{
			for (; num % candidate == 0; num /= candidate)
			{
				ret.add(candidate);
			}
		}
		return ret;
	}

}
