/**
 * @author Snowfoxs
 * @version 1.00 2016/2/29
 * @(#)TestCase.java
 */

public class TestCase
{
    public static void main(String[] args)
    {
	   Person nathan = null;
	   try
	   {
		  System.out.println("Making person: nathan");
		  nathan = new Person("Nathan");
		  System.out.println("made: " + nathan);
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   try
	   {
		  System.out.println("Making person: nathan");
		  nathan = new Person("");
		  System.out.println("made: " + nathan);
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   Vehicle truck = null;
	   try
	   {
		  System.out.println("Making Vehicle: truck");
		  truck = new Truck("Ford", 8, nathan, 1000, 2000);
		  System.out.println("made: " + truck);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverTowingCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverLoadCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   try
	   {
		  System.out.println("Making Vehicle: truck");
		  truck = new Truck("Ford", 8, nathan, -1000, 2000);
		  System.out.println("made: " + truck);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverTowingCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverLoadCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   try
	   {
		  System.out.println("Making Vehicle: truck");
		  truck = new Truck("Ford", 5, nathan, 1000, 2000);
		  System.out.println("made: " + truck);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverTowingCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverLoadCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   Person person = null;
	   try
	   {
		  System.out.println("Making person: person");
		  person = new Person("Bob");
		  System.out.println("made: " + person);
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   Vehicle truck1 = null;
	   try
	   {
		  System.out.println("Making Vehicle: truck1");
		  truck1 = new Truck("Chevy", 900, person, 9999.156, 5);
		  System.out.println("made: " + truck1);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverTowingCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverLoadCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   Vehicle testVehicle = null;
	   try
	   {
		  System.out.println("Making Vehicle: testVehicle");
		  testVehicle = new Vehicle("Fiat", 2, person);
		  System.out.println("made: " + testVehicle);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   Truck testTruck = null;
	   try
	   {
		  System.out.println("Making Truck: testTruck");
		  testTruck = new Truck("Smart", 1, person, 10, 5);
		  System.out.println("made: " + testTruck);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverTowingCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverLoadCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   Truck testTruck1 = null;
	   try
	   {
		  System.out.println("Making Truck: testTruck");
		  testTruck1 = new Truck("Smart", 1, person, 10, 5);
		  System.out.println("made: " + testTruck1);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverTowingCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverLoadCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   try
	   {
		  System.out.println("Making Vehicle: truck");
		  truck = new Truck("", 8, nathan, 1.3, 1500);
		  System.out.println("made: " + truck);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverTowingCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverLoadCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   }

	   try
	   {
		  System.out.println("Making Vehicle: truck");
		  truck = new Truck("Ford", 8, nathan, 1.3, 1500);
		  System.out.println("made: " + truck);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverTowingCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverLoadCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   }

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

	   try
	   {
		  System.out.println("Making Vehicle: testVehicle");
		  testVehicle = new Vehicle("Chevy", 6, person);
		  System.out.println("made: " + testVehicle);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
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

	   try
	   {
		  System.out.println("Making Truck: testTruck");
		  testTruck = new Truck("Smart", 6, person, 0.5, 5);
		  System.out.println("made: " + testTruck);
	   } catch (CylinderException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (EmptyStringException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (NegativeValueException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverTowingCapacityException e)
	   {
		  System.out.println(e.getMessage());
	   } catch (OverLoadCapacityException e)
	   {
		  System.out.println(e.getMessage());
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
	   System.out.println("Made it to the end!");
    }
}