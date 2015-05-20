package Main;

public abstract class Vehicle
{
	String Name;
	String Color;
	Integer Weight;
	Person Owner;
	
	
	public String getName()
	{
		return Name;
	}


	public void setName(String name)
	{
		Name = name;
	}


	public String getColor()
	{
		return Color;
	}


	public void setColor(String color)
	{
		Color = color;
	}


	public Integer getWeight()
	{
		return Weight;
	}


	public void setWeight(Integer weight)
	{
		Weight = weight;
	}


	public Person getOwner()
	{
		return Owner;
	}


	public void transferOwnership(Person newOwner){
		Owner = newOwner;
	}
}
