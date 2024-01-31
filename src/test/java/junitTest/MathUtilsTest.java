package junitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MathUtilsTest {

	private MathUtils mathutils;
	
	@Before
	public void setup() {
		mathutils = new MathUtils();
	}
	
	@After
	public void tearDown() {
		// Clean Resources
	}
	
	@Test
	public void testAdd() {
		assertEquals(9, mathutils.add(5, 4));
		assertEquals(-3, mathutils.add(-5, 2));
		assertEquals(0, mathutils.add(0, 0));
	}
	@Test
	public void testSubtract() {
		assertEquals(8, mathutils.subtract(11, 3));
		assertEquals(-5, mathutils.subtract(-2, 3));
		assertEquals(0, mathutils.subtract(0, 0));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(12, mathutils.multiply(4, 3));
		assertEquals(-12, mathutils.multiply(-4, 3));
		assertEquals(0, mathutils.multiply(0, 0));
	}
	
	@Test
	public void testDivide() {
		assertEquals(3.5, mathutils.divide(7, 2), 0.001);
		assertEquals(-3.5, mathutils.divide(-7, 2), 0.001);
		assertEquals(0, mathutils.divide(0, 5), 0.001);
		
		// Test Divide by Zero
		assertEquals(-1.0, mathutils.divide(4, 0), 0.001);
	}

}
