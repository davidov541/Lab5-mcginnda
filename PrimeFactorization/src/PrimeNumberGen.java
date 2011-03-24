import java.util.ArrayList;


public class PrimeNumberGen {

	public static ArrayList<Integer> GeneratePrimeNumbers(int num)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (num > 2)
		{
			arr.add(2);
		}
		return arr;
	}
}
