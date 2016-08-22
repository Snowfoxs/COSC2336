/**
 * Created by Snowfoxs on 3/23/2016.
 */
public class OverTowingCapacityException extends Exception
{
    /**
	* No-arg constructor
	*/
    public OverTowingCapacityException()
    {
	   super("Error: Towing capacity may not exceed 1500 pounds");
    }

    /**
	* Constructor which accepts an int
	* @param load the load
	*/
    public OverTowingCapacityException(int load)
    {
	   super("Error: Towing capacity may not exceed 1500 pounds\t"+
			 load + " was entered");
    }
}
