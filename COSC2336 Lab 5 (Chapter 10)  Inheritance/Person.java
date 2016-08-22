/**
 * @author Snowfoxs
 * @version 1.00 2016/2/29
 * @(#)Person.java
 */

public class Person
{
    private String name;

    /**
	* Constructor which accepts a string, being the person's name.
	*
	* @param theName the person's name
	*/
    public Person(String theName)
    {
	   System.out.println("Person's constructor called");
	   name = theName;
    }

    /**
	* Returns the name of the person as a string
	*
	* @return the person's name
	*/
    public String toString()
    {
	   System.out.println("Person's toString called");
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
	   System.out.println("Person's equals called");
	   return name.equals(other.name);
    }
}
