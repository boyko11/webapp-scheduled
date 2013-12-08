package conf;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;


public class WebInit implements WebApplicationInitializer {

	public void onStartup(ServletContext container) throws ServletException {
		
		System.out.println("---->>>>>>> Hey there!!! I am your programmatic web.xml, ain't that somethin'?");
		
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringAppContext.class);

		container.addListener(new ContextLoaderListener(rootContext));
		
	}

}