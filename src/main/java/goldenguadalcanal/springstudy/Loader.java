package goldenguadalcanal.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 加载spring配置文件
 * @author bilei
 *
 */
public final class Loader {
	
	private static volatile ApplicationContext ctx;
	
	private Loader(){}
	
	/**
	 * 获取ApplicationContext实例
	 * @return
	 */
	public static ApplicationContext getContext() {
		if(null == ctx) {
			synchronized(Loader.class) {
				if(null == ctx) {
					ctx = new ClassPathXmlApplicationContext("spring-config.xml");
				}
			}
		}
		return ctx;
	}
	
	/**
	 * 获取ApplicationContext实例
	 * @return
	 */
	public static ApplicationContext getContext(String file) {
		if(null == ctx) {
			synchronized(Loader.class) {
				if(null == ctx) {
					ctx = new ClassPathXmlApplicationContext(file);
				}
			}
		}
		return ctx;
	}
	
}
