package app.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class SomeService {

	public void doSomeServiceWork() {

		System.out
				.println("Hey, hey, Heeeey, you've got this thing working. The time is: "
						+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
	}
}