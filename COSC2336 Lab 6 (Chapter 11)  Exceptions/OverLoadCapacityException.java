/**
 * Created by Snowfoxs on 3/23/2016.
 */
public class OverLoadCapacityException extends Exception
{
    /**
	* No-arg constructor
	*/
    public OverLoadCapacityException()
    {
	   super("Error: Truck load may not exceed 1.3 tons.");
    }

    /**
	* Constructor which accepts a double
	* @param load the load
	*/
    public OverLoadCapacityException(double load)
    {
	   super("Error: Error: Truck load may not exceed 1.3 tons.\t"+
			 load + " was entered");
    }
}
