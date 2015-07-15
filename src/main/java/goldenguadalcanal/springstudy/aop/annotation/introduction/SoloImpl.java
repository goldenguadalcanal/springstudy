package goldenguadalcanal.springstudy.aop.annotation.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoloImpl implements ISolo {

	private Logger log  = LoggerFactory.getLogger(getClass());
	
	public void solo(String instrument) {
		// TODO Auto-generated method stub
		log.info("[introduction] solo playing with {}",instrument);
	}

}
