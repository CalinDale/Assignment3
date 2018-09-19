import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ComputeImplementationTest {

	ICompute interfaceObj;
	ComputeImplementation implementationObj;
	
	int x;
	int y;
	
	@Before
	public void setUp() throws Exception {
		implementationObj = new ComputeImplementation();
		
		x = 10;
		y = 12;
		
		interfaceObj = Mockito.mock(ICompute.class);
		Mockito.when(interfaceObj.multiply(x, y)).thenReturn(120);
		
		implementationObj.setObj(interfaceObj);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSquareVar() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		assertEquals((x*y), implementationObj.multiply(x, y));
	}

}
