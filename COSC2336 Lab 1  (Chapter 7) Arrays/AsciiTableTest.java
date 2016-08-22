/**
 * @(#)AsciiTableTest.java
 *
 *
 * @author Snowfoxs
 * @version 1.00 2016/1/20
 */

import java.util.Scanner;

public class AsciiTableTest {

	public static void main(String[] args)
	{
		int length = 1;
		String userInput;
		AsciiTableClass table1 = new AsciiTableClass();

		// Test 1 Good Data

		userInput = table1.setUserInput("test");
		length = table1.countInput(userInput);
		char[] userArray = new char[length];
		userArray = table1.convertInput(userInput);
		table1.printIndexs(userArray, length);

		if (userInput == "test" && length == 4 && userArray[0] == 't' &&
		 userArray[3] == 't')
		{
			System.out.println("Success");
		} else
		{
			System.out.println("Fail");
		}

		// Test 2 Good Data

		AsciiTableClass table2 = new AsciiTableClass();
		userInput = table2.setUserInput("abcdefghijklmnopqrstuvwxyz");
		length = table2.countInput(userInput);
		char[] userArray2 = new char[length];
		userArray2 = table2.convertInput(userInput);
		table2.printIndexs(userArray2, length);

		if (userInput == "abcdefghijklmnopqrstuvwxyz" && length == 26 && 
			userArray2[0] == 'a' && userArray2[25] == 'z')
		{
			System.out.println("Success");
		} else
		{
			System.out.println("Fail");
		}

		// Test 3 Good Data

		AsciiTableClass table3 = new AsciiTableClass();
		userInput = table3.setUserInput("nathan");
		length = table3.countInput(userInput);
		char[] userArray3 = new char[length];
		userArray3 = table3.convertInput(userInput);
		table3.printIndexs(userArray3, length);

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

		AsciiTableClass badData1 = new AsciiTableClass();
		userInput = badData1.setUserInput("TEST");
		length = badData1.countInput(userInput);
		char[] userArray4 = new char[length];
		userArray4 = badData1.convertInput(userInput);
		badData1.printIndexs(userArray4, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray4[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}

		// Test 5 Bad Data

		AsciiTableClass badData2 = new AsciiTableClass();
		userInput = badData2.setUserInput("foo bar");
		length = badData2.countInput(userInput);
		char[] userArray5 = new char[length];
		userArray5 = badData2.convertInput(userInput);
		badData2.printIndexs(userArray5, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray5[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}

		// Test 6 Bad Data
		AsciiTableClass badData3 = new AsciiTableClass();
		userInput = badData3.setUserInput("123");
		length = badData3.countInput(userInput);
		char[] userArray6 = new char[length];
		userArray6 = badData3.convertInput(userInput);
		badData3.printIndexs(userArray5, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray6[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}

		// Test 7 Bad Data
		AsciiTableClass badData4 = new AsciiTableClass();
		userInput = badData4.setUserInput("@$#%^");
		length = badData4.countInput(userInput);
		char[] userArray7 = new char[length];
		userArray7 = badData4.convertInput(userInput);
		badData4.printIndexs(userArray5, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray7[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}

		// Test 8 Good Data

		AsciiTableClass table4 = new AsciiTableClass();
		userInput = table4.setUserInput("a");
		length = table4.countInput(userInput);
		char[] userArray8 = new char[length];
		userArray8 = table4.convertInput(userInput);
		table4.printIndexs(userArray8, length);

		if (userInput == "a" && length == 1 && userArray8[0] == 'a')
		{
			System.out.println("Success");
		} else
		{
			System.out.println("Fail");
		}

		// Test 9 Good Data

		AsciiTableClass table5 = new AsciiTableClass();
		userInput = table5.setUserInput("cosc");
		length = table5.countInput(userInput);
		char[] userArray9 = new char[length];
		userArray9 = table5.convertInput(userInput);
		table5.printIndexs(userArray9, length);

		if (userInput == "cosc" && length == 4 && userArray9[0] == 'c' && 
			userArray9[3] == 'c')
		{
			System.out.println("Success");
		} else
		{
			System.out.println("Fail");
		}

		// Test 10 Bad Data 

		AsciiTableClass badData5 = new AsciiTableClass();
		userInput = badData5.setUserInput("π");
		length = badData5.countInput(userInput);
		char[] userArray10 = new char[length];
		userArray10 = badData5.convertInput(userInput);
		badData5.printIndexs(userArray10, length);

		if (userInput == "badinput" && length == 8 && userArray4[0] == 'b' &&
			userArray6[7] == 't')
		{
			System.out.println("Success Handling Bad Input");
		} else
		{
			System.out.println("Failed Handling Bad Input");
		}
	}
}