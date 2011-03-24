import java.util.ArrayList;


public class PrimeNumberGen {

	public static ArrayList<Integer> GeneratePrimeNumbers(int num)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 2; i < num; i++)
		{
			arr.add(i);
			for(int j = 0; j < arr.size() - 1; j++)
			{
				if (i % arr.get(j) == 0)
				{
					arr.remove(arr.size() - 1);
					break;
				}
			}
		}
		return arr;
	}
}
