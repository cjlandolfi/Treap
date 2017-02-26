import static org.junit.Assert.*;

import org.junit.Test;

public class TreapTest {
	
	Treap<String> StringTest = new Treap<String>();
	Treap<Integer> IntegerTest = new Treap<Integer>(60);

	@Test
	public void testStringTest() {
		StringTest.add("Hello");
		assertTrue(StringTest.add(":)"));
		StringTest.add("World");
		StringTest.add("Hello");
		StringTest.add("Friend");
		assertFalse(StringTest.add("Friend"));
		assertEquals("Find Test 1","Friend",StringTest.find("Friend"));
		assertNotEquals("Find Test 2","FRIEND",StringTest.find("Friend"));
		//Check console to see if the Treap is correct
		System.out.println(StringTest.toString());
	}
	
	@Test
	public void testIntegerTest() {
		IntegerTest.add(6);
		assertTrue(IntegerTest.add(5));
		IntegerTest.add(3005);
		IntegerTest.add(19);
		IntegerTest.add(1997);
		assertFalse(IntegerTest.add(1997));
		//Check console to see if the Treap is correct
		System.out.println(IntegerTest.toString());
	}

}
