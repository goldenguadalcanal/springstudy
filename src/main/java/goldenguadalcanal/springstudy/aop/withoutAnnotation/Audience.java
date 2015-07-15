package goldenguadalcanal.springstudy.aop.withoutAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Audience {   
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	public void buyingBeer() {
		log.info("[@Before] going to buy beer");
	}
	
	public void applause() {
		log.info("[@After] applause!");
	}
	
	public void watchPerformance(ProceedingJoinPoint jp) throws Throwable {
		log.info("[@Around] coming to the living house");
		jp.proceed();
		log.info("[@Around] stand up!");
	}
	
	public void refund() {
		log.error("[@AfterThrowing] they sucked! refund!");
	}
	
	public void show() {
		log.info("[@AfterReturning] nice gear!");
	}
	
	public void beginPlaying(String performer,String instrument) {
		log.info("[With Params @After] {} plays the {}",performer,instrument);
	}
}
