
public class SickPerson extends Person
{

	private int severity;
	
	public SickPerson(String name, int age, int severity) 
	{
		super(name, age);
		this.severity=severity;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the severity
	 */
	public int getSeverity() 
	{
		return severity;
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
			if(((SickPerson) p).getSeverity()<severity)
			{
				return -1;
			}
			else if(((SickPerson) p).getSeverity()>severity)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		// TODO Auto-generated method stub
	}
	
	public String toString()
	{
		return String.format("%s Severity level %d", super.toString(),severity);
	}

}
