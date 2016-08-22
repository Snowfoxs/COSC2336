/**
 * Created by Snowfoxs 4/12/2016
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProductInfo
{
    final static int SIZE = 7;	// how many lines are in the file?

    public static String[] getBookNames() throws IOException
    {
	   int count = 0;
	   String[] books = new String[SIZE];
	   File myFile = new File("BookPrices.txt");
	   Scanner inputFile = new Scanner(myFile);

	   while (inputFile.hasNext() && count < books.length)
	   {
		  String str;

		  str = inputFile.nextLine();

		  String[] parts = str.split(",");
		  books[count] = parts[0];
		  count++;
	   }
	   inputFile.close();

	   return books;
    }

    public static double[] getBookPrices() throws IOException
    {
	   int count = 0;
	   double[] prices = new double[SIZE];

	   File myFile = new File("BookPrices.txt");
	   Scanner inputFile = new Scanner(myFile);

	   while (inputFile.hasNext() && count < prices.length)
	   {
		  String str;

		  str = inputFile.nextLine();
		  String[] parts = str.split(",");

		  prices[count] = Double.parseDouble(parts[1]);
		  count++;
	   }
	   inputFile.close();

	   return prices;
    }

}
