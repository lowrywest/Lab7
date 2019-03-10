import java.util.Stack;

public class StackHospital<PatientType> extends Hospital {
	
	 private Stack<PatientType> stackHospital= new Stack<>();
	public StackHospital()
	{
		
	}

	@Override
	public void addPatient(Object patient) {
		// TODO Auto-generated method stub
		stackHospital.push((PatientType) patient);
		
	}

	@Override
	public Object nextPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object treatNextPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numPatients() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String hospitalType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String allPatientInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
