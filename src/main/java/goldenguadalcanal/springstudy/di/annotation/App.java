package goldenguadalcanal.springstudy.di.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
		IMediaPlayer player = (IMediaPlayer)ctx.getBean("CDMediaPlayer");
		player.play();
		ctx.close();
	}

}
