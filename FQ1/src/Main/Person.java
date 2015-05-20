package Main;

import java.util.UUID;

public class Person
{
	String FirstName;
	String LastName;
	UUID PersonID;
	
	public Person(String FirstName, String LastName)
	{
		 PersonID = UUID.randomUUID();
		 this.FirstName = FirstName;
		 this.LastName = LastName;
	}
	public String getFirstName()
	{
		return FirstName;
	}
	public void setFirstName(String firstName)
	{
		FirstName = firstName;
	}
	public String getLastName()
	{
		return LastName;
	}
	public void setLastName(String lastName)
	{
		LastName = lastName;
	}
	public UUID getPersonID()
	{
		return PersonID;
	}
	
	
}
