import org.junit.Assert;
import org.junit.Test;

public class HealthyPersonTest {

	@Test
	public void getReasonTest() 
	{
		HealthyPerson Morgan= new HealthyPerson("Morgan", 19, "Visiting");
		Assert.assertEquals("Visiting", Morgan.getReason());
		
	}
	
	@Test
	public void compareToImplTest()
	{
		HealthyPerson Morgan= new HealthyPerson("Morgan", 19, "Visiting");
		HealthyPerson Griffin= new HealthyPerson("Griffin", 42, "Check up");
		HealthyPerson Morgan2=new HealthyPerson("Morgan", 19, "Follow up");
		SickPerson Faith= new SickPerson("Faith", 19, 9);
		Assert.assertEquals("Names Comparaed incorrectly.", Morgan.compareToImpl(Griffin), 1);
		Assert.assertEquals("Names Comparaed incorrectly.", Griffin.compareToImpl(Morgan2), -1);
		Assert.assertEquals("Names Comparaed incorrectly.", Morgan.compareToImpl(Morgan2), 0);
		Assert.assertEquals("Names Comparaed incorrectly.", Morgan.compareToImpl(Faith), 0);
	}
	@Test
	public void toStringTest()
	{
		HealthyPerson Griffin= new HealthyPerson("Griffin", 42,"Checkup");
		Assert.assertTrue("HealthyPerson toString incorrect", Griffin.toString().equalsIgnoreCase("Griffin, a 42-year old. In for Checkup"));
	}
}
