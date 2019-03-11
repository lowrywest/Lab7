import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>
 {
	
	private PriorityQueue<PatientType> priorityHospital= new PriorityQueue<PatientType>();
	
	public PriorityQueueHospital()
	{	
		
	}
	
	public void addPatient(PatientType patient) 
	{
		// TODO Auto-generated method stub
		priorityHospital.add( patient);
	}

	public PatientType nextPatient() 
	{
		// TODO Auto-generated method stub
		return priorityHospital.peek();
	}

	public PatientType treatNextPatient() 
	{
		return priorityHospital.poll();
		// TODO Auto-generated method stub
	}

	public int numPatients() 
	{
		// TODO Auto-generated method stub
		return priorityHospital.size();
	}

	public String hospitalType() 
	{
		// TODO Auto-generated method stub
		return "PriorityQueueHospital";
	}

	public String allPatientInfo() 
	{
		String temp="";
		for(int i=0; i<numPatients(); i++)
		{
			temp+= priorityHospital.remove().toString();
		}
		// TODO Auto-generated method stub
		return temp;
	}

}
