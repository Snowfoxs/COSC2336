/**
 * @(#)StringOp.java
 *
 *
 * @author Snowfoxs
 * @version 1.00 2016/2/17
 */

import java.util.ArrayList;

public class StringOp
{
	private final static String MISTER_CLEAN = "^[a-z]+$";

	/**
	Method which accepts an input, and sorts the string alphabetically
	@param user's input
	@return sorted output
	*/
	public static String stringOrder(String input)
	{
		String err = "Error 404 at --> " + input;
		byte temp;
		if (checkString(input) == true)
		{
			byte[] chars = input.getBytes();

			for (int i = 0; i < chars.length -1; i++)
			{
				for (int j = 1; j < chars.length -i; j++)
				{
					if (chars[j-1] > chars[j])
					{
						temp = chars[j-1];
						chars[j-1] = chars[j];
						chars[j] = temp;
					}
				}
			}

			return new String(chars);
		} else 
		{
			return err;
		}
	}

	private static boolean checkString(String input)
	{
		boolean status;
		if (!input.matches(MISTER_CLEAN))
		{
			status = false;
			System.out.println("Caught an Error!");
		} else
		{
			status = true;
		}
		return status;
	}
}