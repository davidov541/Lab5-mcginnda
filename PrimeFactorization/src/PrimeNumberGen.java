import java.util.ArrayList;


public class PrimeNumberGen {

	public static ArrayList<Integer> GeneratePrimeNumbers(int num)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (num > 2)
		{
			for(int i = 2; i < num; i++)
			{
				arr.add(i);
			}
		}
		return arr;
	}
}
