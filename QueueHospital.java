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
