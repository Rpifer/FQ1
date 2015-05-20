import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Main.Car;
import Main.MotorCycle;
import Main.Person;
import Main.Truck;


public class Q1Test
{
	@Test
	public void test()
	{
		Person a = new Person("John","Smith");
		Car aCar = new Car(4, "aCar","Blue",1500,a);
		UUID carID =  UUID.randomUUID();
		Truck aTruck = new Truck(2, "aTruck", "Cyan",7000,a);
		UUID truckID = UUID.randomUUID();
		Person b = new Person("Juanita","Lupe");
		aTruck.transferOwnership(b);
		MotorCycle aCycle = new MotorCycle(false, "aMoto","Green",425,a);
		UUID motorCycleID = UUID.randomUUID();
		HashMap<UUID, Person> people = new HashMap<>();
		HashMap<UUID, Car> cars = new HashMap<>();
		HashMap<UUID, Truck> trucks = new HashMap<>();
		HashMap<UUID, MotorCycle> cycles = new HashMap<>();
		
		people.put(a.getPersonID(), a);
		people.put(b.getPersonID(), b);
		cars.put(carID, aCar);
		trucks.put(truckID, aTruck);
		cycles.put(motorCycleID, aCycle);
		
		assertEquals(people.size(), 2);
		assertEquals(cars.size(), 1);
		assertEquals(trucks.size(), 1);
		assertEquals(cycles.size(), 1);
		assertEquals(cars.get(carID),aCar);
		assertEquals(trucks.get(truckID),aTruck);
		assertEquals(cycles.get(motorCycleID),aCycle);
		assertEquals(people.get(a.getPersonID()),a);
		assertEquals(people.get(b.getPersonID()),b);
		assertEquals(aTruck.getOwner(),b);
		assertEquals(b.getFirstName(),"Juanita");
		assertEquals(aTruck.getColor(),"Cyan");
	}

}
