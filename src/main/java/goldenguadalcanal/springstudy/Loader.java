package goldenguadalcanal.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class Loader {
	
	private static volatile ApplicationContext ctx;
	
	private Loader(){}
	
	public static ApplicationContext getInstance() {
		if(null == ctx) {
			synchronized(Loader.class) {
				if(null == ctx) {
					ctx = new ClassPathXmlApplicationContext("spring-config.xml");
				}
			}
		}
		return ctx;
	}
	
}
