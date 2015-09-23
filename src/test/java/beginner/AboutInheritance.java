package beginner;

import static constant.Constants.__;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AboutInheritance {

	class Parent {
		public String doStuff() { return "parent"; }
	}
	class Child extends Parent {
		public String doStuff() { return "child"; }
		public String doStuff(String s) { return s; }
	}
	
	@Test
	public void differenceBetweenOverloadingAndOverriding() {
		assertEquals(new Parent().doStuff(),__);
		assertEquals(new Child().doStuff(),__);
		assertEquals(new Child().doStuff("oh no"),__);
	}
	
	abstract class ParentTwo {
		abstract public Collection<?> doStuff();
	}
	
	class ChildTwo extends ParentTwo {
		public Collection<?> doStuff() { return Collections.emptyList(); };
	}
	
	@Test
	public void overriddenMethodsMayReturnSubtype() {
		// What do you need to change in order to get rid of the type cast?
		// Why does this work?
		List<?> list = (List<?>)new ChildTwo().doStuff();
		assertEquals(list instanceof List, __);
	}
}
