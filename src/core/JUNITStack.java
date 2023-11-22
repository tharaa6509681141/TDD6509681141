package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	public void testPushElmToTop() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		assertEquals(0, size);
		
		s1.push(1);
		assertEquals(1, s1.top());
		
	}
	
	public void testLastInFirstOut(){
		Stack s1 = new Stack();
		int size = s1.getSize();
		assertEquals(0, size);
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		assertEquals(3, s1.top());
		assertEquals(3, s1.pop());
		assertEquals(2, s1.top());
	}

}
