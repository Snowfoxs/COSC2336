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
	* @exception CylinderException thrown if cylinders are less than 6 or
	* greater than 10
	* @exception EmptyStringException thrown if empty string passed
	* @exception NegativeValueException thrown if a negative value is passed
	* @exception OverLoadCapacityException thrown if load capacity is over
	* 1.3 tons
	* @exception OverTowingCapacityException thrown if towing capacity is
	* over 1500 pounds
	*/

    public Truck(String passedManufacturer, int passedCylinders,
			  Person passedOwner, double passedLoadCapacity,
			  int passedTowingCapacity)throws CylinderException,
		  EmptyStringException, NegativeValueException,
		  OverTowingCapacityException,OverLoadCapacityException
    {
	   super(passedManufacturer, passedCylinders,
			 passedOwner);
	  // System.out.println("Truck's Constructor Called");

	   if (passedLoadCapacity > 1.3)
	   {
		  throw new OverLoadCapacityException(passedLoadCapacity);
	   }

	   if (passedLoadCapacity < 0)
	   {
		  throw new NegativeValueException(passedLoadCapacity);
	   }

	   if (passedTowingCapacity > 1500)
	   {
		  throw new OverTowingCapacityException(passedTowingCapacity);
	   }

	   if (passedTowingCapacity < 0)
	   {
		  throw new NegativeValueException(passedTowingCapacity);
	   }

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
	  // System.out.println("Truck's toString called");
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
	  // System.out.println("Truck's equals called");
	   return super.equals(other) &&
			 loadCapacity == other.loadCapacity &&
			 towingCapacity == other.towingCapacity;
    }
}
