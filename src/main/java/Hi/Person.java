package Hi;

public class Person
{
	String firstName;
	String lname;
	int age;
	
	/**
	 * @param fname
	 * @param lname
	 * @param age
	 */
	public Person(String fname, String lname, int age)
	{ 
		this.firstName = fname;
		this.lname = lname;
		this.age = age;
	}

	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return firstName;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.firstName = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lname = lname;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	public Person makePerson(Person that) throws UnderAgeException
	{
		if (age<18 || that.age<18)
		{
			throw new UnderAgeException();
		}
		Person child =new Person(this.firstName, that.lname, 0);
		return child;
	}

	public static void main(String[] args)
	{
		Person r =new Person("Romeo", "Mon", 15);
		System.out.println("R "+r);

	}

	@Override
	public String toString()
	{
		return "Person: "+ firstName+ " "+ lname + ", " + age;
	}

}
