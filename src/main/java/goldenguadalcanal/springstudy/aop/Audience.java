package goldenguadalcanal.springstudy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
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
	public void watchPerformance(ProceedingJoinPoint jp) throws Throwable {
		log.info("入场");
		jp.proceed();
		log.info("起立");
	}
	
	@AfterThrowing("performance()")
	public void refund() {
		log.error("演砸了，退票");
	}
}
