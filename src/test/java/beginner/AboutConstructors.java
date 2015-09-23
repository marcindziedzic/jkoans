package beginner;

import static constant.Constants.__;
import static org.junit.Assert.*;
import org.junit.Test;

public class AboutConstructors {

	class A {
		String someString = "a";
		public A() { someString+= "x"; }
		
	}
	
	class B extends A {
		public B() { someString += "g"; };
	}
	
	@Test
	public void simpleConstructorOrder(){
		assertEquals(new B().someString, __);
	}
	
	class Aa {
		String someString = "a";
		public Aa() { someString+= "x"; }
		public Aa(String s) {
			someString += s;
		}
	}
	
	class Bb extends Aa {
		public Bb() { super("Boo"); someString += "g"; };
	}
	
	@Test
	public void complexConstructorOrder(){
		assertEquals(new Bb().someString, __);
	}
	
}
