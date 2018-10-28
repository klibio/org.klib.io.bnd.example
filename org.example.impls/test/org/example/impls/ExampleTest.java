package org.example.impls;

import junit.framework.TestCase;


public class ExampleTest extends TestCase {
	public void testSaysHello() throws Exception {
		String result = new ExampleComponent().sayHello("Bob");
			assertEquals("Hello Bob", result);
	}

}
