package Main;

public class Truck extends Vehicle implements vehicleInterface
{
	Integer numberOfAxels;

	public Integer getNumberOfAxels()
	{
		return numberOfAxels;
	}

	public void setNumberOfAxels(Integer numberOfAxels)
	{
		this.numberOfAxels = numberOfAxels;
	}
	
	public Truck(Integer numberOfAxels, String Name, 
			String Color,Integer Weight,Person Owner)
	{
		super();
		this.numberOfAxels = numberOfAxels;
		this.Name =  Name;
		this.Color = Color;
		this.Weight = Weight;
		this.Owner = Owner;
	}
}
