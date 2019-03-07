
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
	protected int compareToImpl(Person p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
