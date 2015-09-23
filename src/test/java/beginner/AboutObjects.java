package beginner;

import static constant.Constants.__;
import static org.junit.Assert.*;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class AboutObjects {

	@Test
	public void newObjectInstancesCanBeCreatedDirectly() {
		assertEquals(new Object() instanceof Object, __);
	}

	@Test
	public void allClassesInheritFromObject() {
		class Foo {}

		Class<?>[] ancestors = getAncestors(new Foo());
		assertEquals(ancestors[0], __);
		assertEquals(ancestors[1], __);
	}

	@Test
	public void objectToString() {
		Object object = new Object();
		// TODO: Why is it best practice to ALWAYS override toString?
		String expectedToString = MessageFormat.format("{0}@{1}", Object.class.getName(), Integer.toHexString(object.hashCode()));
		assertEquals(expectedToString, __); // hint: object.toString()
	}

	@Test
	public void toStringConcatenates(){
		final String string = "ha";
		Object object = new Object(){
			@Override public String toString(){
				return string;
			}
		};
		assertEquals(string + object, __);
	}

	@Test
	public void toStringIsTestedForNullWhenInvokedImplicitly(){
		String string = "string";
		assertEquals(string+null, __);
	}

	private Class<?>[] getAncestors(Object object) {
		List<Class<?>> ancestors = new ArrayList<Class<?>>();
		Class<?> clazz = object.getClass();
		while(clazz != null) {
			ancestors.add(clazz);
			clazz = clazz.getSuperclass();	
		}
		return ancestors.toArray(new Class[]{});	
	}
	
}
