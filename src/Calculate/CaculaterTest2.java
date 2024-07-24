package Calculate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaculaterTest2 {

	Caculater c = new Caculater();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		int p = c.add(1, 2);
		assertEquals(3, p);
		fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
