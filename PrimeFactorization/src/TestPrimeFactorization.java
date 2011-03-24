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
	
	@Test
	public void TestTwo()
	{
		assertEquals(getList(2), PrimeFactorization.GetPrimeFactors(2));
	}
	
	@Test
	public void TestThree()
	{
		assertEquals(getList(3), PrimeFactorization.GetPrimeFactors(3));
	}
	
	@Test
	public void TestFour()
	{
		assertEquals(getList(2, 2), PrimeFactorization.GetPrimeFactors(4));
	}
	
	@Test
	public void TestSix()
	{
		assertEquals(getList(2, 3), PrimeFactorization.GetPrimeFactors(6));
	}
	
	@Test
	public void TestEight()
	{
		assertEquals(getList(2, 2, 2), PrimeFactorization.GetPrimeFactors(8));
	}
	
	@Test
	public void TestNine()
	{
		assertEquals(getList(3, 3), PrimeFactorization.GetPrimeFactors(9));
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
