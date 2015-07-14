package goldenguadalcanal.springstudy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class Audience {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Pointcut("execution(* goldenguadalcanal.springstudy.aop.IPerformance.perform())")
	public void performance() {}
	
	@Before("performance()")
	public void buyingBeer() {
		log.info("买啤酒");
	}
	
	@After("performance()")
	public void applause() {
		log.info("鼓掌喝彩");
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		log.info("入场");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("起立");
	}
}
