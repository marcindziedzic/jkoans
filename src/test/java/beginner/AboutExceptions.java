package beginner;

import static constant.Constants.__;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class AboutExceptions {
	
	private void doStuff() throws IOException {
		throw new IOException();
	}
	
	@Test
	public void catchCheckedExceptions() {
		String s;
		try {
			doStuff();
			s = "code ran normally";
		} catch(IOException e) { 
			s = "exception thrown";
		}
		assertEquals(s, __);
	}
	
	@Test
	public void useFinally() {
		String s = "";
		try {
			doStuff();
			s += "code ran normally";
		} catch(IOException e) { 
			s += "exception thrown";
		} finally {
			s += " and finally ran as well";
		}
		assertEquals(s, __);
	}
	
	@Test
	public void finallyWithoutCatch() {
		String s = "";
		try {
			s = "code ran normally";
		} finally {
			s += " and finally ran as well";
		}
		assertEquals(s, __);
	}
	
	private void tryCatchFinallyWithVoidReturn(StringBuilder whatHappened) {
		try {
			whatHappened.append("did something dangerous");
			doStuff();
		} catch(IOException e) { 
			whatHappened.append("; the catch block executed");
			return;
		} finally {
			whatHappened.append(", but so did the finally!");
		}
	}
	
	@Test
	public void finallyIsAlwaysRan() {
		StringBuilder whatHappened = new StringBuilder();
		tryCatchFinallyWithVoidReturn(whatHappened);
		assertEquals(whatHappened.toString(), __);
	}
	
	@SuppressWarnings("finally") // this is suppressed because returning in finally block is obviously a compiler warning
	private String returnStatementsEverywhere(StringBuilder whatHappened) {
		try {
			whatHappened.append("try");
			doStuff();
			return "from try";
		} catch (IOException e) {
			whatHappened.append(", catch");
			return "from catch";
		} finally {
			whatHappened.append(", finally");
			// Think about how bad an idea it is to put a return statement in the finally block
			// DO NOT DO THIS!
			return "from finally";
		}
	}
	
	@Test
	public void returnInFinallyBlock() {
		StringBuilder whatHappened = new StringBuilder();
		// Which value will be returned here?
		assertEquals(returnStatementsEverywhere(whatHappened), __);
		assertEquals(whatHappened.toString(), __);
	}
	
	private void doUncheckedStuff() {
		throw new RuntimeException();	
	}
	
	@Test
	public void catchUncheckedExceptions() {
		// What do you need to do to catch the unchecked exception?
		doUncheckedStuff();
	}
	
	@SuppressWarnings("serial")
	static class ParentException extends Exception {}  
	@SuppressWarnings("serial")
	static class ChildException extends ParentException {}
	
	private void throwIt() throws ParentException {
		throw new ChildException();
	}
	
	@Test
	public void catchOrder() {
		 String s = "";
		try {
			throwIt();
		} catch(ChildException e) {
			s = "ChildException";
		} catch(ParentException e) {
			s = "ParentException";
		}
		assertEquals(s, __);
	}	
}
