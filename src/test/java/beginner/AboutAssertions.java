package beginner;

import static constant.Constants.__;
import static org.junit.Assert.*;
import org.junit.Test;

public class AboutAssertions {

	@Test 
	public void assertBooleanTrue() {
		assertTrue(false); // should be true really
	}

	@Test
	public void assertBooleanFalse() {
		assertFalse(true); 
	}
	
	@Test
	public void assertNullObject(){
		assertNull(new Object());
	}
	
	@Test
	public void assertNotNullObject(){
		assertNotNull(null); // anything other than null should pass here...
	}

	@Test
	public void assertEqualsUsingExpression(){
		assertTrue("Hello World!".equals(__));
	}

	@Test
	public void assertEqualsWithBetterFailureMessage(){
		assertEquals(1, __);
	}

	@Test
	public void assertEqualsWithDescriptiveMessage() {
		// Generally, when using an assertXXX methods, expectation is on the 
		// left and it is best practice to use a String for the first arg 
		// indication what has failed
		assertEquals("The answer to 'life the universe and everything' should be 42", 42, __);
	}
	
	@Test
	public void assertSameInstance(){
		Object same				= new Integer(1);
		Object sameReference	= __;
		assertSame(same, sameReference);
	}
	
	@Test
	public void assertNotSameInstance(){
		Integer same           = new Integer(1);
		Integer sameReference  = same;
		assertNotSame(same, sameReference); 
	}
}
