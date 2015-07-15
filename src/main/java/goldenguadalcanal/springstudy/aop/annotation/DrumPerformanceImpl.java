package goldenguadalcanal.springstudy.aop.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("drum")
public class DrumPerformanceImpl implements IPerformance {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	public void perform() {
		// TODO Auto-generated method stub
		log.info("begin to play the drum");
		throw new RuntimeException();
	}
	
	public void perform(String performer, String instrument) {
		// TODO Auto-generated method stub
	}

	public String showInstrument() {
		// TODO Auto-generated method stub
		return "Pearl Drum";
	}

}
