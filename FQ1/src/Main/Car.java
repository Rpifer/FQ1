package Main;

public class Car extends Vehicle implements vehicleInterface
{
	Integer numberOfDoors;

	public Integer getNumberOfDoors()
	{
		return numberOfDoors;
	}

	public void setNumberOfDoors(Integer numberOfDoors)
	{
		this.numberOfDoors = numberOfDoors;
	}

	public Car(Integer numberOfDoors, String Name, 
			String Color,Integer Weight,Person Owner)
	{
		super();
		this.numberOfDoors = numberOfDoors;
		this.Name =  Name;
		this.Color = Color;
		this.Weight = Weight;
		this.Owner = Owner;
	}
	
}
