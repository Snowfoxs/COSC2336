import java.util.Objects;

/**
 * @author Snowfoxs
 * @version 1.00 2016/2/29
 * @(#)Truck.java
 */

public class Truck extends Vehicle
{
    private double loadCapacity;
    private int towingCapacity;

    /**
	* Constructor which generates a Truck object and accepts parameters
	*
	* @param passedManufacturer   The manufacturer
	* @param passedCylinders      The number of cylinders
	* @param passedOwner          The owner as a Peron object
	* @param passedLoadCapacity   The load capacity
	* @param passedTowingCapacity The towing capacity
	*/

    public Truck(String passedManufacturer, int passedCylinders,
			  Person passedOwner, double passedLoadCapacity,
			  int passedTowingCapacity)
    {
	   super(passedManufacturer, passedCylinders,
			 passedOwner);
	   System.out.println("Truck's Constructor Called");

	   loadCapacity = passedLoadCapacity;
	   towingCapacity = passedTowingCapacity;
    }

    /**
	* Returns a string containing the data supplied by Vehicle and Truck
	*
	* @return the data supplied by Vehicle and Truck
	*/

    public String toString()
    {
	   System.out.println("Truck's toString called");
	   return super.toString() + " " + loadCapacity + " " +
			 towingCapacity;
    }

    /**
	* Checks equality between Vehicle and Truck's data
	*
	* @param other the Truck object
	* @return the boolean state of equality between the data
	*/
    public boolean equals(Truck other)
    {
	   System.out.println("Truck's equals called");
	   return super.equals(other) &&
			 loadCapacity == other.loadCapacity &&
			 towingCapacity == other.towingCapacity;
    }
}
