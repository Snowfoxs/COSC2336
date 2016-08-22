/**
 * Created by Snowfoxs on 3/23/2016.
 */
public class CylinderException extends Exception
{
    /**
	* No-arg constructor
	*/
    public CylinderException()
    {
	   super("Error: Cylinders may not be less than 6 or greater than 10.");
    }

    /**
	* Constructor which accepts and int
	* @param cylinders the cylinders
	*/
    public CylinderException(int cylinders)
    {
	   super("Error: Cylinders may not be less than 6 or greater than 10.\t"+
			 cylinders + " were entered");
    }
}
