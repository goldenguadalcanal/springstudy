package goldenguadalcanal.springstudy.aop.withoutAnnotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuitarPerformanceImpl implements IPerformance {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	public void perform() {
		// TODO Auto-generated method stub
		log.info("begin to play the guitar");
	}

	public void perform(String performer, String instrument) {
		// TODO Auto-generated method stub
	}

	public String showInstrument() {
		// TODO Auto-generated method stub
		return "Gibson Les Paul Guitar";
	}

}
