/**
 * Created by Snowfoxs on 5/4/2016.
 */
class testfile
{
	private static boolean passed = true;

	public static void main(String args[])
	{
		char[] testArray = {'a', 'b', 'a', 'c', 'd', 'a', 'a', 'f', 'g', 'h', 'a', 'i', 'a'};
		char testChar = 'a';


		CharCount charCount = new CharCount();
		System.out.println("Iterations of character: " + testChar + "\n" +
				charCount.count(testArray, testChar));
		if (charCount.count(testArray, testChar) == 6)
		{
			testPass();
		} else
		{
			testFail();
		}


		char[] testArray1 = {'a', 'b', 'a', 'c'};
		char testChar1 = 'a';
		char testChar2 = 'f';
		char testChar3 = 'c';

		System.out.println("Iterations of character: " + testChar1 + "\n" +
				charCount.count(testArray1, testChar1));
		if (charCount.count(testArray1, testChar1) == 2)
		{
			testPass();
		} else
		{
			testFail();
		}
		System.out.println("Iterations of character: " + testChar2 + "\n" +
				charCount.count(testArray1, testChar2));
		if (charCount.count(testArray1, testChar2) == 0)
		{
			testPass();
		} else
		{
			testFail();
		}
		System.out.println("Iterations of character: " + testChar3 + "\n" +
				charCount.count(testArray1, testChar3));
		if (charCount.count(testArray1, testChar3) == 1)
		{
			testPass();
		} else
		{
			testFail();
		}

		char[] testArray2 = {'n', 'a', 't', 'h', 'a', 'n'};
		char testChar4 = 'n';
		char testChar5 = 'a';
		char testChar6 = 't';
		char testChar7 = 'h';

		System.out.println("Iterations of character: " + testChar4 + "\n" +
				charCount.count(testArray2, testChar4));
		if (charCount.count(testArray2, testChar4) == 2)
		{
			testPass();
		} else
		{
			testFail();
		}
		System.out.println("Iterations of character: " + testChar5 + "\n" +
				charCount.count(testArray2, testChar5));
		if (charCount.count(testArray2, testChar5) == 2)
		{
			testPass();
		} else
		{
			testFail();
		}
		System.out.println("Iterations of character: " + testChar6 + "\n" +
				charCount.count(testArray2, testChar6));
		if (charCount.count(testArray2, testChar6) == 1)
		{
			testPass();
		} else
		{
			testFail();
		}
		System.out.println("Iterations of character: " + testChar7 + "\n" +
				charCount.count(testArray2, testChar7));
		if (charCount.count(testArray2, testChar7) == 1)
		{
			testPass();
		} else
		{
			testFail();
		}

		if (passed == false)
		{
			System.out.println("FAILED A TEST SOMEWHERE!");
		} else
		{
			System.out.println("PASSED ALL TESTS!");
		}

	}

	private static void testPass()
	{
		System.out.println("Passed Test");
	}

	private static void testFail()
	{
		System.out.println("Failed Test");
		passed = false;
	}
}