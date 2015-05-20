package Main;

import java.util.HashMap;
import java.util.UUID;

public class TestVehicle
{

	public static void main(String[] args)
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
		
		
		

	}

}
