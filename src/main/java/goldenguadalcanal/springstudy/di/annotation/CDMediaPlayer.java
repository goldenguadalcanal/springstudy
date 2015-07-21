package goldenguadalcanal.springstudy.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * cd播放机
 * @author bilei
 *
 */
@Component
public class CDMediaPlayer implements IMediaPlayer {

	
	@Autowired
	private CDMedia media;
	
	public void play() {
		// TODO Auto-generated method stub
		media.playingSong("welcome to the jungle");
	}

}
