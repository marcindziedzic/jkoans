package beginner;

import static constant.Constants.__;
import static org.junit.Assert.*;
import org.junit.Test;

public class AboutPrimitives {

	@Test
	public void wholeNumbersAreOfTypeInt() {
		assertEquals(getType(1), __); // hint: int.class
	}

	@Test
	public void primitivesOfTypeIntHaveAnObjectTypeInteger() {
		Object number = 1;
		assertEquals(getType(number), __);

		// Primitives can be automatically changed into their object type via a process called auto-boxing
		// We will explore this in more detail in intermediate.AboutAutoboxing
	}

	@Test
	public void integersHaveAFairlyLargeRange() {
		assertEquals(Integer.MIN_VALUE, __);
		assertEquals(Integer.MAX_VALUE, __);
	}

	@Test
	public void integerSize() {
		assertEquals(Integer.SIZE, __);  // This is the amount of bits used to store an int
	}

	@Test
	public void wholeNumbersCanAlsoBeOfTypeLong() {
		assertEquals(getType(1l), __);
	}

	@Test
	public void primitivesOfTypeLongHaveAnObjectTypeLong() {
		Object number = 1l;
		assertEquals(getType(number), __);
	}

	@Test
	public void longsHaveALargerRangeThanInts() {
		assertEquals(Long.MIN_VALUE, __);
		assertEquals(Long.MAX_VALUE, __);
	}

	@Test
	public void longSize() {
		assertEquals(Long.SIZE, __);
	}

	@Test
	public void wholeNumbersCanAlsoBeOfTypeShort() {
		assertEquals(getType((short) 1), __); // The '(short)' is called an explicit cast - to type 'short'
	}

	@Test
	public void primitivesOfTypeShortHaveAnObjectTypeShort() {
		Object number = (short) 1;
		assertEquals(getType(number), __);
	}

	@Test
	public void shortsHaveASmallerRangeThanInts() {
		assertEquals(Short.MIN_VALUE, __);  // hint: You'll need an explicit cast
		assertEquals(Short.MAX_VALUE, __);
	}

	@Test
	public void shortSize() {
		assertEquals(Short.SIZE, __);
	}

	@Test
	public void wholeNumbersCanAlsoBeOfTypeByte() {
		assertEquals(getType((byte) 1), __);
	}

	@Test
	public void primitivesOfTypeByteHaveAnObjectTypeByte() {
		Object number = (byte) 1;
		assertEquals(getType(number), __);
	}

	@Test
	public void bytesHaveASmallerRangeThanShorts() {
		assertEquals(Byte.MIN_VALUE, __);
		assertEquals(Byte.MAX_VALUE, __);

		// Why would you use short or byte considering that you need to do explicit casts?
	}

	@Test
	public void byteSize() {
		assertEquals(Byte.SIZE, __);
	}

	@Test
	public void wholeNumbersCanAlsoBeOfTypeChar() {
		assertEquals(getType((char) 1), __);
	}

	@Test
	public void singleCharactersAreOfTypeChar() {
		assertEquals(getType('a'), __);
	}

	@Test
	public void primitivesOfTypeCharHaveAnObjectTypeCharacter() {
		Object number = (char) 1;
		assertEquals(getType(number), __);
	}

	@Test
	public void charsCanOnlyBePositive() {
		assertEquals((int) Character.MIN_VALUE, __);
		assertEquals((int) Character.MAX_VALUE, __);

		// Why did we cast MIN_VALUE and MAX_VALUE to int? Try it without the cast.
	}

	@Test
	public void charSize() {
		assertEquals(Character.SIZE, __);
	}

	@Test
	public void decimalNumbersAreOfTypeDouble() {
		assertEquals(getType(1.0), __);
	}

	@Test
	public void primitivesOfTypeDoubleCanBeDeclaredWithoutTheDecimalPoint() {
		assertEquals(getType(1d), __);
	}

	@Test
	public void primitivesOfTypeDoubleCanBeDeclaredWithExponents() {
		assertEquals(getType(1e3), __);
		assertEquals(1.0e3, __);
		assertEquals(1E3, __);
	}

	@Test
	public void primitivesOfTypeDoubleHaveAnObjectTypeDouble() {
		Object number = 1.0;
		assertEquals(getType(number), __);
	}

	@Test
	public void doublesHaveALargeRange() {
		assertEquals(Double.MIN_VALUE, __);
		assertEquals(Double.MAX_VALUE, __);
	}

	@Test
	public void doubleSize() {
		assertEquals(Double.SIZE, __);
	}

	@Test
	public void decimalNumbersCanAlsoBeOfTypeFloat() {
		assertEquals(getType(1f), __);
	}

	@Test
	public void primitivesOfTypeFloatCanBeDeclaredWithExponents() {
		assertEquals(getType(1e3f), __);
		assertEquals(1.0e3f, __);
		assertEquals(1E3f, __);
	}

	@Test
	public void primitivesOfTypeFloatHaveAnObjectTypeFloat() {
		Object number = 1f;
		assertEquals(getType(number), __);
	}

	@Test
	public void floatsHaveASmallerRangeThanDoubles() {
		assertEquals(Float.MIN_VALUE, __);
		assertEquals(Float.MAX_VALUE, __);
	}

	@Test
	public void floatSize() {
		assertEquals(Float.SIZE, __);
	}

	private Class<?> getType(int value) {
		return int.class;
	}

	private Class<?> getType(long value) {
		return long.class;
	}

	private Class<?> getType(float value) {
		return float.class;
	}

	private Class<?> getType(double value) {
		return double.class;
	}

	private Class<?> getType(byte value) {
		return byte.class;
	}

	private Class<?> getType(char value) {
		return char.class;
	}

	private Class<?> getType(short value) {
		return short.class;
	}

	private Class<?> getType(Object value) {
		return value.getClass();
	}
	
}
