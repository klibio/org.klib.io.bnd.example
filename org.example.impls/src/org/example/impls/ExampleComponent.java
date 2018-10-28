package org.example.impls;

import org.example.api.Greeting;
import org.osgi.service.component.annotations.Component;

@Component
public class ExampleComponent implements Greeting {
	public String sayHello(String example) {
		return "Hello " + example;
	}

}
