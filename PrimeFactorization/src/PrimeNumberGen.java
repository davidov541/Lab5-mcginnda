import java.util.ArrayList;


public class PrimeNumberGen {

	public static ArrayList<Integer> GeneratePrimeNumbers(int num)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 2; i < num; i++)
		{
			if (i % 2 != 0 || i == 2)
			{
				arr.add(i);
			}
		}
		return arr;
	}
}
