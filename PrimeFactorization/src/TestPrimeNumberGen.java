import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class TestPrimeNumberGen {
	@Test
	public void TestOne()
	{
		assertEquals(getList(), PrimeNumberGen.GeneratePrimeNumbers(1));
	}
	
	@Test
	public void TestTwo()
	{
		assertEquals(getList(), PrimeNumberGen.GeneratePrimeNumbers(2));
	}
	
	@Test
	public void TestThree()
	{
		assertEquals(getList(2), PrimeNumberGen.GeneratePrimeNumbers(3));
	}
	
	@Test
	public void TestFour()
	{
		assertEquals(getList(2, 3), PrimeNumberGen.GeneratePrimeNumbers(4));
	}
	
	@Test
	public void TestFive()
	{
		assertEquals(getList(2, 3), PrimeNumberGen.GeneratePrimeNumbers(5));
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
