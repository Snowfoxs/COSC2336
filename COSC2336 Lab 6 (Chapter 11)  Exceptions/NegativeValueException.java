/**
 * Created by Snowfoxs on 3/23/2016.
 */
public class NegativeValueException extends Exception
{
    /**
	* No-arg constructor
	*/
    public NegativeValueException()
    {
	   super("Error: Negative value");
    }

    /**
	* Constructor which accepts an int
	* @param number number passed in
	*/
    public NegativeValueException(int number)
    {
	   super("Error: Negative value\t"+
			 number + " was entered");
    }

    /**
	* Constructor which accepts a double
	* @param number number passed in
	*/
    public NegativeValueException(double number)
    {
	   super("Error: Negative value\t"+
			 number + " was entered");
    }
}
