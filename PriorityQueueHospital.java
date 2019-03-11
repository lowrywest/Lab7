import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType> extends Hospital{

	private PriorityQueue<PatientType> priorityHospital;
	public PriorityQueueHospital()
	{	
	}
	@Override
	public void addPatient(Object patient) 
	{
		// TODO Auto-generated method stub
		priorityHospital.add((PatientType) patient);
	}

	@Override
	public Object nextPatient() 
	{
		// TODO Auto-generated method stub
		return priorityHospital.peek();
	}

	@Override
	public Object treatNextPatient() 
	{
		return priorityHospital.poll();
		// TODO Auto-generated method stub
	}

	@Override
	public int numPatients() 
	{
		// TODO Auto-generated method stub
		return priorityHospital.size();
	}

	@Override
	public String hospitalType() 
	{
		// TODO Auto-generated method stub
		return "PriorityQueueHospital";
	}

	@Override
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
