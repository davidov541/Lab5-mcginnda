import java.util.ArrayList;

public class PrimeFactorization {

	public static ArrayList<Integer> GetPrimeFactors(int num) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if (num %2 == 0)
		{
			ret.add(2);
			num /= 2;
		}
		
		if (num > 1)
		{
			ret.add(num);
		}
		return ret;
	}

}
