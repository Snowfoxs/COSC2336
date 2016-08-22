/**
 * @author Snowfoxs
 * @version 1.00 2016/2/29
 * @(#)TestCase.java
 */

public class TestCase
{
    public static void main(String[] args)
    {
	   System.out.println("Making person: nathan");
	   Person nathan = new Person("Nathan");
	   System.out.println("made: " + nathan);

	   System.out.println("Making Vehicle: truck");
	   Vehicle truck = new Truck("Ford", 8, nathan, 1000, 2000);
	   System.out.println("made: " + truck);

	   System.out.println("Making person: person");
	   Person person = new Person("Bob");
	   System.out.println("made: " + person);

	   System.out.println("Making Vehicle: truck1");
	   Vehicle truck1 = new Truck("Chevy", 900, person, 9999.156, 5);
	   System.out.println("made: " + truck1);

	   System.out.println("Making Vehicle: testVehicle");
	   Vehicle testVehicle = new Vehicle("Fiat", 2, person);
	   System.out.println("made: " + testVehicle);

	   System.out.println("Making Truck: testTruck");
	   Truck testTruck = new Truck("Smart", 1, person, 10, 5);
	   System.out.println("made: " + testTruck);

	   System.out.println("Making Truck: testTruck");
	   Truck testTruck1 = new Truck("Smart", 1, person, 10, 5);
	   System.out.println("made: " + testTruck1);

	   if (truck.equals(truck))
	   {
		  System.out.println("Truck equals itself");
		  System.out.println("PASS");
		  System.out.println("\t\t\t" + truck);
	   } else
	   {
		  System.out.println("FAIL");
		  System.out.println("Something bad happened");
	   }
	   if (truck1.equals(truck1))
	   {
		  System.out.println("truck1 equals itself");
		  System.out.println("PASS");
		  System.out.println("\t\t\t" + truck1);
	   } else
	   {
		  System.out.println("FAIL");
	   }
	   if (testVehicle.equals(testVehicle))
	   {
		  System.out.println("testVehicle equals itself");
		  System.out.println("PASS");
		  System.out.println("\t\t\t" + testVehicle);
	   } else
	   {
		  System.out.println("FAIL");
	   }
	   if (testTruck.equals(testTruck))
	   {
		  System.out.println("testTruck equals itself");
		  System.out.println("PASS");
		  System.out.println("\t\t\t" + testTruck);
	   } else
	   {
		  System.out.println("FAIL");
	   }
	   if (testTruck.equals(truck))
	   {
		  System.out.println("FAIL");
	   }
	   else
	   {
		  System.out.println("testTruck does not equal truck");
		  System.out.println("PASS");
	   }
	   if (testTruck.equals(testTruck1))
	   {
		  System.out.println("testTruck is identical to testTruck1");
		  System.out.println("PASS");
	   }
	   else
	   {
		  System.out.println("FAIL");
	   }
    }
}