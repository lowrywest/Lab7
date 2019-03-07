
public class SickPerson extends Person {

	private int severity;
	/**
	 * @return the severity
	 */
	public int getSeverity() 
	{
		return severity;
	}

	public SickPerson(String name, int age, int severity) 
	{
		super(name, age);
		this.severity=severity;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int compareToImpl(Person p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
