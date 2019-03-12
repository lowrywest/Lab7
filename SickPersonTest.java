import org.junit.Assert;
import org.junit.Test;

public class SickPersonTest {

	@Test
	public void getSeverityTest() 
	{
		SickPerson Morgan= new SickPerson("Morgan", 19, 9);
		Assert.assertEquals(9, Morgan.getSeverity());
		
	}
	
	@Test
	public void compareToImplTest()
	{
		SickPerson Morgan= new SickPerson("Morgan", 19, 9);
		SickPerson Griffin= new SickPerson("Griffin", 42, 2);
		SickPerson Me=new SickPerson("Lowry", 13, 2);
		HealthyPerson Morgan2=new HealthyPerson("Morgan", 19, "Follow up");
		
		Assert.assertEquals("Severity Compared incorrectly", Me.compareToImpl(Griffin), 0);
		Assert.assertEquals("Severity Compared incorrectly", Morgan.compareToImpl(Griffin), 1);
		Assert.assertEquals("Severity Compared incorectly", Me.compareToImpl(Morgan),-1);
		
		Assert.assertEquals("Severity Compared incorectly", Morgan2.compareToImpl(Morgan),0);
	}
	
	@Test
	public void toStringTest()
	{
		SickPerson Griffin= new SickPerson("Griffin",42,2);
		Assert.assertTrue("SickPerson toString is incorrect", Griffin.toString().equalsIgnoreCase("Griffin, a 42-year old. Severity level 2"));
		
	}

}
