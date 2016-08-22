/**
 * @author Snowfoxs
 * @version 1.00 2016/2/29
 * @(#)Person.java
 */

public class Person
{
    private String name;
    private String empty = "";

    /**
	* Constructor which accepts a string, being the person's name.
	*
	* @param theName the person's name
	* @exception EmptyStringException thrown if no string
	*/
    public Person(String theName) throws EmptyStringException
    {
	   //System.out.println("Person's constructor called");

	   if (theName == null && theName.isEmpty() || theName.equals((empty)))
	   {
		  throw new EmptyStringException();
	   }

	   name = theName;
    }

    /**
	* Returns the name of the person as a string
	*
	* @return the person's name
	*/
    public String toString()
    {
	   //System.out.println("Person's toString called");
	   return name;
    }

    /**
	* Checks name equality.
	*
	* @param other a Person object
	* @return returns boolean state of equality
	*/
    public boolean equals(Person other)
    {
	   //System.out.println("Person's equals called");
	   return name.equals(other.name);
    }
}
