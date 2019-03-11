import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital {

	private Queue<PatientType> hospitalQueue=new LinkedList<PatientType>();
	public QueueHospital()
	{
		
	}
	@Override
	public void addPatient(Object patient) {
		// TODO Auto-generated method stub
		hospitalQueue.add((PatientType) patient);
		
	}

	@Override
	public Object nextPatient() 
	{
		// TODO Auto-generated method stub
		return hospitalQueue.peek();
	}

	@Override
	public Object treatNextPatient() 
	{
		// TODO Auto-generated method stub
		return hospitalQueue.poll();
	}

	@Override
	public int numPatients() 
	{
		// TODO Auto-generated method stub
		return hospitalQueue.size();
	}

	@Override
	public String hospitalType() 
	{
		// TODO Auto-generated method stub
		return "QueueHospital";
	}

	@Override
	public String allPatientInfo() 
	{
		String temp="";
		for(int i=0; i<numPatients(); i++)
		{
		temp+= hospitalQueue.remove().toString();
		}
		
		// TODO Auto-generated method stub
		return temp;
	}

}
