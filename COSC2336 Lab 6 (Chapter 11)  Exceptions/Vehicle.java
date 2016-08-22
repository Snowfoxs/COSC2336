/**
 * @author Snowfoxs
 * @version 1.00 2016/2/29
 * @(#)Vehicle.java
 */

public class Vehicle
{
    private String manufacturer;
    private int cylinders;
    private Person owner;
    private String empty = "";

    /**
	* Constructor which accepts arguments and creates a Vehicle object
	*
	* @param passedManufacturer the manufacturer of the vehicle
	* @param passedCylinders    the number of cylinders the vehicle has
	* @param passedOwner        the Person object who is the owner
	* @exception EmptyStringException thrown if empty string entered
	* @exception NegativeValueException thrown if a negative value entered
	*/
    public Vehicle(String passedManufacturer, int passedCylinders,
			    Person passedOwner) throws CylinderException,
		  EmptyStringException, NegativeValueException
    {
	   //System.out.println("Vehicle's constructor called");

	   if (passedCylinders < 6 || passedCylinders > 10)
	   {
		  throw new CylinderException(passedCylinders);
	   }

	   if (passedManufacturer == null && passedManufacturer.isEmpty() ||
			 passedManufacturer.equals(empty))
	   {
		  throw new EmptyStringException();
	   }

	   manufacturer = passedManufacturer;
	   cylinders = passedCylinders;
	   owner = passedOwner;
    }

    /**
	* Returns the data stored in the Vehicle object
	*
	* @return the data which is stored in the Vehicle object
	*/
    public String toString()
    {
	   //System.out.println("Vehicle's toString called");
	   return manufacturer + " " + cylinders + " " + owner;
    }

    /**
	* Returns the state of equality in the Vehicle object
	*
	* @param other the Vehicle object
	* @return the boolean state of equality in the object
	*/

    public boolean equals(Vehicle other)
    {
	  // System.out.println("Vehicle's equals called");
	   return manufacturer.equals(other.manufacturer) &&
			 cylinders == other.cylinders && owner.equals(other.owner);
    }
}