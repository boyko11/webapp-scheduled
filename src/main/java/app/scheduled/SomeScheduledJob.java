package app.scheduled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import app.service.SomeService;

@Component
public class SomeScheduledJob {
	
	@Autowired SomeService someService;
	
	@Scheduled(cron = "0/5 * * * * ?")
	public void doSomeScheduledWork() {
		
		someService.doSomeServiceWork();
	}
}