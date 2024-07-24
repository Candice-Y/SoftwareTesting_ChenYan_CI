package Calculate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CaculaterTest {
	Caculater mycal = new Caculater();

	@Before
	public void setUp() throws Exception {
		System.out.println("--已完成初始化--");
	}

	@Test
	public void testAdd() {
		assertEquals(8, mycal.add(2, 6));
	}

	@Test
	public void testSubtract() {
		assertEquals(2, mycal.subtract(4, 2));
		// assertEquals(7,mycal.subtract(9, 2));
	}

	@Test
	public void testMultiply() {
		assertEquals(15, mycal.multiply(3, 5));
		// assertEquals(12,mycal.multiply(3, 4));
	}

	@Test
	public void testDivide() {
		assertEquals(1, mycal.divide(4, 4));
		// assertEquals(0,mycal.divide(4, 0));
		// assertEquals(2,mycal.divide(4, 2));
	}

}
