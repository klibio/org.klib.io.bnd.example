package org.example.command;

import org.apache.felix.service.command.CommandProcessor;
import org.example.api.Greeting;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(enabled = true, properties =	{
		/* Felix GoGo Shell Commands */
		CommandProcessor.COMMAND_SCOPE + ":String=example",
		CommandProcessor.COMMAND_FUNCTION + ":String=greet"
	},
	service = Object.class
)
public class GreetingCommand {
	@Reference
	private Greeting greetingSvc;

	public void greet(String example) {
		System.out.println(greetingSvc.sayHello(example));
	}
}