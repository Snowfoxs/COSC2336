/**
 * @(#)AsciiTableTest.java
 *
 *
 * @author Snowfoxs
 * @version 1.00 2016/2/3
 */

import java.util.Scanner;

public class AsciiTableTest {

	public static void main(String[] args)
	{
		int length = 1;
		String userInput;
		AsciiTableClass testTable = new AsciiTableClass();

		// Test 1 Good Data

		userInput = testTable.setUserInput("test");
		length = testTable.countInput(userInput);
		char[] userArray = new char[length];
		userArray = testTable.convertInput(userInput);
		testTable.printIndexs(userArray, length);

		if (userInput == "test" && length == 4 && userArray[0] == 't' &&
		 userArray[3] == 't')
		{
			System.out.println("Success");
		} else
		{
			System.out.println("Fail");
		}


		// Test 2 Good Data

		//AsciiTableClass testTable = new AsciiTableClass();
		userInput = testTable.setUserInput("abcdefghijklmnopqrstuvwxyz");
		length = testTable.countInput(userInput);
		char[] userArray2 = new char[length];
		userArray2 = testTable.convertInput(userInput);
		testTable.printIndexs(userArray2, length);

		if (userInput == "abcdefghijklmnopqrstuvwxyz" && length == 26 && 
			userArray2[0] == 'a' && userArray2[25] == 'z')
		{
			System.out.println("Success");
		} else
		{
			System.out.println("Fail");
		}

		// Test 3 Good Data

		//AsciiTableClass testTable = new AsciiTableClass();
		userInput = testTable.setUserInput("nathan");
		length = testTable.countInput(userInput);
		char[] userArray3 = new char[length];
		userArray3 = testTable.convertInput(userInput);
		testTable.printIndexs(userArray3, length);

		if (userInput == "nathan" && length == 6 && userArray3[0] == 'n' &&
			userArray3[5] == 'n')
		{
			System.out.println("Success");
		} else
		{
			System.out.println("Fail");
		}

		// Test 4 Bad Data
		length = 1;

		//AsciiTableClass testTable = new AsciiTableClass();
		userInput = testTable.setUserInput("TEST");
		length = testTable.countInput(userInput);
		char[] userArray4 = new char[length];
		userArray4 = testTable.convertInput(userInput);
		testTable.printIndexs(userArray4, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray4[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}

		// Test 5 Bad Data

		//AsciiTableClass testTable = new AsciiTableClass();
		userInput = testTable.setUserInput("foo bar");
		length = testTable.countInput(userInput);
		char[] userArray5 = new char[length];
		userArray5 = testTable.convertInput(userInput);
		testTable.printIndexs(userArray5, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray5[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}

		// Test 6 Bad Data
		//AsciiTableClass testTable = new AsciiTableClass();
		userInput = testTable.setUserInput("123");
		length = testTable.countInput(userInput);
		char[] userArray6 = new char[length];
		userArray6 = testTable.convertInput(userInput);
		testTable.printIndexs(userArray5, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray6[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}

		// Test 7 Bad Data
		//AsciiTableClass testTable = new AsciiTableClass();
		userInput = testTable.setUserInput("@$#%^");
		length = testTable.countInput(userInput);
		char[] userArray7 = new char[length];
		userArray7 = testTable.convertInput(userInput);
		testTable.printIndexs(userArray5, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray7[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}

		// Test 8 Good Data

		//AsciiTableClass testTable = new AsciiTableClass();
		userInput = testTable.setUserInput("a");
		length = testTable.countInput(userInput);
		char[] userArray8 = new char[length];
		userArray8 = testTable.convertInput(userInput);
		testTable.printIndexs(userArray8, length);

		if (userInput == "a" && length == 1 && userArray8[0] == 'a')
		{
			System.out.println("Success");
		} else
		{
			System.out.println("Fail");
		}

		// Test 9 Good Data

		//AsciiTableClass testTable = new AsciiTableClass();
		userInput = testTable.setUserInput("cosc");
		length = testTable.countInput(userInput);
		char[] userArray9 = new char[length];
		userArray9 = testTable.convertInput(userInput);
		testTable.printIndexs(userArray9, length);

		if (userInput == "cosc" && length == 4 && userArray9[0] == 'c' && 
			userArray9[3] == 'c')
		{
			System.out.println("Success");
		} else
		{
			System.out.println("Fail");
		}

		// Test 10 Bad Data 

		//AsciiTableClass testTable = new AsciiTableClass();
		userInput = testTable.setUserInput("π");
		length = testTable.countInput(userInput);
		char[] userArray10 = new char[length];
		userArray10 = testTable.convertInput(userInput);
		testTable.printIndexs(userArray10, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray6[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}

		testTable.printHashTable();
	}
}