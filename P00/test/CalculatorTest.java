import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private int a , b , c;  //declare the variables as private
	Calculator cal; //calculator cal method

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}


	@Test
	public void testAdd() { 
		//Arrange 
		int a = 4321; //int a value
		int b = 1234; //int b value
		Calculator cal = new Calculator(); //create new calculator
 
		//Act
		int actual = cal.add(a , b); //add in the actual a and b value in the parameter
 
 
		//Assert
		int expected = 5555; //the result expected 
		assertEquals(expected , actual); //the assert method in the parameter put in
 
	}


	@Test
	public  void testSubtract() {
		int a = 9876;
		int b = 4321;
	
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
	
		int expected = 5555;
		assertEquals(actual , expected);
	
	
	}
	@Test
	public void testDivide() {
		int a = 20;
		int b = 2;
	
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
	
		int expected = 10;
		assertEquals(actual , expected);
	
	
	}


//@Test
//public void testDivideWithDenominator() {
//	int actual = cal.divide(a , b);
//	int expected = 3;
//	assertEquals(expected , actual);
//	try {
//		cal.divide(a, c);
//		fail(("Expected an IllegalArgumentException to be thrown"));
//		catch(IllegalArgumentException e) {
//			assertEquals("Division by zero is not supported" , e.getMessage());
//		}catch(Throwable t) {
//			assertEquals("Expected an IllegalArgumentException to be thrown" , t.getMessage());
//		}
//	}
//}
//

//
//	
//
	//@Before
//	public void setUp() throws Exception {
//		cal = new Calculator();
//		a= 4321;
//		b = 1234;
//		c =0;
//	
//	}
//
//@After
//	public void tearDown() throws Exception {
//	}

	
	}


