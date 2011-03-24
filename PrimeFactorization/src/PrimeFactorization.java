import java.util.ArrayList;

public class PrimeFactorization {

	public static ArrayList<Integer> GetPrimeFactors(int num) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int candidate = 2; num > 1; candidate++)
		{
			while (num % candidate == 0)
			{
				ret.add(candidate);
				num /= candidate;
			}
		}
		
		if (num > 1)
		{
			ret.add(num);
		}
		return ret;
	}

}
