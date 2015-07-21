package goldenguadalcanal.springstudy.di.javaconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * cd
 * @author bilei
 *
 */
@Component
public class CDMedia implements IMedia {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public void playingSong(String song) {
		// TODO Auto-generated method stub
		logger.info("now is playing \"{}\"",song);
	}

}
