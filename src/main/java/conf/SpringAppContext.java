package conf;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan(basePackages= {"app"})
public class SpringAppContext {
	
	@Bean(name="testBean")
	public Date testBean() {
		return new Date();
	}

}
