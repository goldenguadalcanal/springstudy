package goldenguadalcanal.springstudy.di.javaconfig;

import java.util.Date;
import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * config
 * @author bilei
 *
 */
@Configuration
@ComponentScan("goldenguadalcanal.springstudy.di.javaconfig")
public class MediaConfig {
/*	
	@Bean
	public CDMedia cdMedia() {
		return new CDMedia();
	}
	
	@Bean(name="mediaPlayer")
	public CDMediaPlayer cdMediaPlayer() {
		return new CDMediaPlayer();
	}
*/
	@Bean
	public Date getDate() {
		return Calendar.getInstance().getTime();
	}
	
	@Bean
	public java.sql.Date getSqlDate() {
		return new java.sql.Date(System.currentTimeMillis());
	}
}
