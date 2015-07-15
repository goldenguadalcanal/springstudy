package goldenguadalcanal.springstudy.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {   
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Pointcut("execution(* goldenguadalcanal.springstudy.aop.annotation.IPerformance.perform())")
	public void performance() {}
	
	/**
	 * for test @AfterReturning
	 */
	@Pointcut("execution(* goldenguadalcanal.springstudy.aop.annotation.IPerformance.showInstrument()))")
	public void showInstrument() {}
	
	/**
	 * for test params
	 * @param performer
	 * @param instrument
	 */
	@Pointcut("execution(* goldenguadalcanal.springstudy.aop.annotation.IPerformance.perform(String,String)) && args(performer,instrument)")
	public void perform(String performer,String instrument) {}
	
	@Before("performance()")
	public void buyingBeer() {
		log.info("[@Before] going to buy beer");
	}
	
	@After("performance()")
	public void applause() {
		log.info("[@After] applause!");
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) throws Throwable {
		log.info("[@Around] coming to the living house");
		jp.proceed();
		log.info("[@Around] stand up!");
	}
	
	@AfterThrowing("performance()")
	public void refund() {
		log.error("[@AfterThrowing] they sucked! refund!");
	}
	
	@AfterReturning("showInstrument()")
	public void show() {
		log.info("[@AfterReturning] nice gear!");
	}
	
	@After("perform(performer,instrument)")
	public void beginPlaying(String performer,String instrument) {
		log.info("[With Params @After] {} plays the {}",performer,instrument);
	}
}
