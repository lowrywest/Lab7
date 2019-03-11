import java.util.Stack;

public class StackHospital<PatientType> extends Hospital {
	
	 private Stack<PatientType> stackHospital= new Stack<>();
	public StackHospital()
	{
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addPatient(Object patient) {
		// TODO Auto-generated method stub
		stackHospital.push((PatientType) patient);
		
	}

	@Override
	public Object nextPatient() 
	{
		// TODO Auto-generated method stub
		return stackHospital.peek();
	}

	@Override
	public Object treatNextPatient() 
	{
		
		// TODO Auto-generated method stub
		return stackHospital.pop();
	}

	@Override
	public int numPatients() 
	{
		// TODO Auto-generated method stub
		return stackHospital.size();
	}

	@Override
	public String hospitalType() {
		// TODO Auto-generated method stub
		return "StackHospital";
	}

	@Override
	public String allPatientInfo() 
	{
		String temp="";
		for(int i=0; i<numPatients(); i++)
		{
			temp+= stackHospital.get(i).toString();
		}
		// TODO Auto-generated method stub
		return temp;
	}

}
