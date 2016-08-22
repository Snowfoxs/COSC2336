public class TestStringAscii
{
	public static void main(String[] args)
	{
		StringAsciiClass testClass = new StringAsciiClass();
		String testCase;

		// TEST CASES
		String testString0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRST"+
		"UVWXYZ0123456789!@#$%^&*(";
		String testString1 = "Test";
		String testString2 = "abc";
		String testString3 = "n@th@N";
		String testString4 = "C0SC";
		String testString5 = "This is a t3st";
		String testString6 = "123468abc9023KLJ$$";
		String testString7 = "%&%$";
		String testString8 = " ";
		String testString9 = "556498";
		// END TEST CASES


		// RUN TESTS
		testClass.printIndexes(testString0);
		testClass.printIndexes(testString1);
		testClass.printIndexes(testString2);
		testClass.printIndexes(testString3);
		testClass.printIndexes(testString4);
		testClass.printIndexes(testString5);
		testClass.printIndexes(testString6);
		testClass.printIndexes(testString7);
		testClass.printIndexes(testString8);
		testClass.printIndexes(testString9);


		// PRINT RESULTS
		testClass.printHashTable();
		System.out.println("\n");

		// MORE TESTS

		testCase = testClass.cleanMachine(testString0);
		if (testCase.equals(
			"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"))
		{
			System.out.println("Passed Test 1");
		} else
		{
			System.out.println("Failed Test 1");
		}

		testCase = testClass.cleanMachine(testString1);
		if (testCase.equals(
			"test"))
		{
			System.out.println("Passed Test 2");
		} else
		{
			System.out.println("Failed Test 2");
		}
		testCase = testClass.cleanMachine(testString2);
		if (testCase.equals(
			"abc"))
		{
			System.out.println("Passed Test 3");
		} else
		{
			System.out.println("Failed Test 3");
		}
		testCase = testClass.cleanMachine(testString3);
		if (testCase.equals(
			"nthn"))
		{
			System.out.println("Passed Test 4");
		} else
		{
			System.out.println("Failed Test 4");
		}		
		testCase = testClass.cleanMachine(testString4);
		if (testCase.equals(
			"csc"))
		{
			System.out.println("Passed Test 5");
		} else
		{
			System.out.println("Failed Test 5");
		}		
		testCase = testClass.cleanMachine(testString5);
		if (testCase.equals(
			"thisisatst"))
		{
			System.out.println("Passed Test 6");
		} else
		{
			System.out.println("Failed Test 6");
		}		
		testCase = testClass.cleanMachine(testString6);
		if (testCase.equals(
			"abcklj"))
		{
			System.out.println("Passed Test 7");
		} else
		{
			System.out.println("Failed Test 7");
		}		
		testCase = testClass.cleanMachine(testString7);
		if (testCase.equals(
			""))
		{
			System.out.println("Passed Test 8");
		} else
		{
			System.out.println("Failed Test 8");
		}		
		testCase = testClass.cleanMachine(testString8);
		if (testCase.equals(
			""))
		{
			System.out.println("Passed Test 9");
		} else
		{
			System.out.println("Failed Test 9");
		}		
		testCase = testClass.cleanMachine(testString9);
		if (testCase.equals(
			""))
		{
			System.out.println("Passed Test 10");
		} else
		{
			System.out.println("Failed Test 10");
		}

	}
}