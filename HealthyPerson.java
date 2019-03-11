
public class HealthyPerson extends Person {

	private String reason;
	
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason=reason;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the reason
	 */
	public String getReason() 
	{
		return reason;
	}
	
	@Override
	protected int compareToImpl(Person p) 
	{
		if(!p.toString().equalsIgnoreCase(this.toString()))
		{
			return 0;
		}
		else
		{
			return this.getName().compareTo(p.getName());
		}
	}
	
	public String toString()
	{
		return String.format("%s In for %s", super.toString(),reason);
	}

}
