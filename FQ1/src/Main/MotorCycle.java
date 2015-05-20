package Main;

public class MotorCycle extends Vehicle implements vehicleInterface
{
	boolean hasSideCar;

	public boolean isHasSideCar()
	{
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar)
	{
		this.hasSideCar = hasSideCar;
	}
	
	public MotorCycle(boolean hasSideCar, String Name, 
			String Color,Integer Weight,Person Owner)
	{
		super();
		this.hasSideCar = hasSideCar;
		this.Name =  Name;
		this.Color = Color;
		this.Weight = Weight;
		this.Owner = Owner;
	}
}
