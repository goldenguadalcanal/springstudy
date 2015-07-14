package goldenguadalcanal.springstudy.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("guitar")
public class GuitarPerformanceImpl implements IPerformance {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	public void perform() {
		// TODO Auto-generated method stub
		log.info("开始演奏吉他");
	}

}