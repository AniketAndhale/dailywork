package aniket12;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
  fr
public class GeneralUnitTest {
	static GeneralApI api =null;
	@Before
	public static  void start()
	{
		api =new GeneralApI();
		System.out.println("general api created");
	}
	@After
	public static void destroye()
	{
		api=null;
		System.out.println("api is destroyed");
	}
	@Test
	public static void test() {
		assertEquals(12,api.add(4,6));
		//fail("Not yet implemented");
	}
	public void testcheckEven()
	{
		assertEquals(true,api.checkEven(12));
	}
	public void getFactorial(int num)
	{
		assertEquals(120,api.getfactorial(5));
	}

}
