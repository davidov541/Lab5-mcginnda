import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class TestPrimeFactorization {
	@Test
	public void TestJUnit()
	{
		assertTrue("Blahblahblah", true);
	}
	
	@Test
	public void TestOne()
	{
		assertEquals(getList(), PrimeFactorization.GetPrimeFactors(1));
	}
	
	private ArrayList<Integer> getList(int... vars)
	{
		ArrayList<Integer> returnable = new ArrayList<Integer>();
		for(int i : vars)
		{
			returnable.add(i);
		}
		return returnable;
	}
}
