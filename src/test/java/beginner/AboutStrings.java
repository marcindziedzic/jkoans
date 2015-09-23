package beginner;

import static constant.Constants.__;
import static org.junit.Assert.*;
import org.junit.Test;

import java.text.MessageFormat;

public class AboutStrings {

	@Test
	public void implicitStrings() {
		assertEquals("just a plain ole string".getClass(), __);
	}

	@Test
	public void newString() {
		// very rarely if ever should Strings be created via new String() in 
		// practice - generally it is redundant, and done repetitively can be slow
		String string = new String();
		String empty = "";
		assertEquals(string.equals(empty), __);
	}

	@Test
	public void newStringIsRedundant() {
		String stringInstance = "zero";
		String stringReference = new String(stringInstance);
		assertEquals(stringInstance.equals(stringReference), __);
	}

	@Test
	public void newStringIsNotIdentical() {
		String stringInstance = "zero";
		String stringReference = new String(stringInstance);
		assertEquals(stringInstance == stringReference, __);
	}

	@Test
	public void stringConcatenation() {
		String one = "one";
		String space = " ";
		String two = "two";
		assertEquals(one + space + two, __);
	}

	@Test
	public void efficientStringConcatenation() {
		// the above implicit string concatenation looks nice - but, it is expensive.
		// it creates a new string instance on each concatenation. here's a better alternative:
		assertEquals(new StringBuilder("one").append(" ").append("two").toString(), __);
	}

	@Test
	public void readableStringFormattingWithStringFormat() {
		assertEquals(String.format("%s %s %s", "a", "b", "a"), __);
	}

	@Test
	public void extraArgumentsToStringFormatGetIgnored() {
		assertEquals(String.format("%s %s %s", "a", "b", "c", "d"), __);
	}

	@Test
	public void insufficientArgumentsToStringFormatCausesAnError() {
		try {
			String.format("%s %s %s", "a", "b");
			fail("No Exception was thrown!");
		} catch (Exception e) {
			assertEquals(e.getClass(), __);
			assertEquals(e.getMessage(), __);
		}
	}

	@Test
	public void readableStringFormattingWithMessageFormat() {
		assertEquals(MessageFormat.format("{0} {1} {0}", "a", "b"), __);
	}

	@Test
	public void extraArgumentsToMessageFormatGetIgnored() {
		assertEquals(MessageFormat.format("{0} {1} {0}", "a", "b", "c"), __);
	}

	@Test
	public void insufficientArgumentsToMessageFormatDoesNotReplaceTheToken() {
		assertEquals(MessageFormat.format("{0} {1} {0}", "a"), __);
	}

}
