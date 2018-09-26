import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class DoFinanceImplementationTest {

	IDoFinance interfaceObj;
	DoFinanceImplementation implementationObj;
	
	int amount;
	Employee emp;
	
	@Before
	public void setUp() throws Exception {
		implementationObj = new DoFinanceImplementation();
		
		amount = 50000;
		emp = new Employee();
		emp.setHourlySalary(20);
		emp.setKiwiSaver(4);
		
		interfaceObj = Mockito.mock(IDoFinance.class);
		Mockito.when(interfaceObj.computeTax(amount)).thenReturn(15000);
		Mockito.when(interfaceObj.weeklySalary(emp)).thenReturn(800);
		Mockito.when(interfaceObj.fortnightSalary(emp)).thenReturn(1600);
		Mockito.when(interfaceObj.computeKiwiSaver(emp)).thenReturn(0.80);
		
		implementationObj.setObj(interfaceObj);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testComputeTax() {
		assertEquals(((amount/100) * 30), implementationObj.computeTax(amount));
	}

	@Test
	public void testWeeklySalary() {
		assertEquals((emp.getHourlySalary() * 40), implementationObj.weeklySalary(emp));
	}

	@Test
	public void testFortnightSalary() {
		assertEquals((emp.getHourlySalary() * 80), implementationObj.fortnightSalary(emp));
	}

	@Test
	public void testComputeKiwiSaver() {
		assertEquals(((emp.getHourlySalary() / 100) * emp.getKiwiSaver()), implementationObj.computeKiwiSaver(emp), 1);
	}
	
	@Test
	public void testJenkins() {
		assertEquals("jenkins", "jenkins");
	}

}
