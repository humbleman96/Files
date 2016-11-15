
public class People {

	private int number;
	private String name;
	private String famName;
	private int yearOfBirth;
	
	
	public People(int number, String name, String famName, int yearOfBirth)
	{
	 	this.number = number;
	 	this.name = name;
	 	this.famName = famName;
	 	this.yearOfBirth = yearOfBirth;
	}
	
	public People() {
		number = 0;
		name = null;
		famName = null;
		yearOfBirth = 0;
	}
	
	
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getFamName()
	{
		return famName;
	}
	
	
	public void setFamName(String famName)
	{
		this.famName = famName;
	}
	
	public int getYearOfBirth()
	{
		return yearOfBirth;
	}
	
	
	public void setYearOfBirth(int yearOfBirth)
	{
		this.yearOfBirth = yearOfBirth;
	}

	
}
