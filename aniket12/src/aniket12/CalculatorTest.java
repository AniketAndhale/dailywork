package aniket12;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;
	@Before
	public  void init()
	{
		calculator =new Calculator();
		System.out.println("calculator object creted");
		
	}

	@After
	public  void destroyed()
	{
		calculator = null;
		System.out.println("calculator object destroyed");
		
	}
@Test
public void testAddNumber()
{
	assertEquals(5,calculator.add(3, 2));
	
}

	
}
