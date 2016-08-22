/**
 * @(#)StringTest.java
 *
 *
 * @author Snowfoxs
 * @version 1.00 2016/2/17
 */

public class StringTest
{
	public static void main(String[] args)
	{
		boolean fail = false;

		String test = StringOp.stringOrder("Nathan");
		System.out.println(test);
		if (test.equals("Error 404 at --> Nathan") == false)
		{
			fail = true;
		}

		test = StringOp.stringOrder("zyxwvutsrqponmlkjihgfedcba");
		System.out.println(test);
		if (test.equals("abcdefghijklmnopqrstuvwxyz") == false)
		{
			fail = true;
		}

		test = StringOp.stringOrder("COSC");
		System.out.println(test);
		if (test.equals("Error 404 at --> COSC") == false)
		{
			fail = true;
		}

		test = StringOp.stringOrder("123");
		System.out.println(test);
		if (test.equals("Error 404 at --> 123") == false)
		{
			fail = true;
		}

		test = StringOp.stringOrder("%$^&%");
		System.out.println(test);
		if (test.equals("Error 404 at --> %$^&%") == false)
		{
			fail = true;
		}

		test = StringOp.stringOrder("chickens");
		System.out.println(test);
		if (test.equals("ccehikns") == false)
		{
			fail = true;
		}

		if (fail == false)
		{
			System.out.println("Passed all tests");
		} else 
		{
			System.out.println("Failed some or all tests");
		}
	}
}