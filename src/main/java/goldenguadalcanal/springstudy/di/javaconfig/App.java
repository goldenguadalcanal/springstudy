package goldenguadalcanal.springstudy.di.javaconfig;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(goldenguadalcanal.springstudy.di.javaconfig.MediaConfig.class);
		IMediaPlayer player = (IMediaPlayer)ctx.getBean("CDMediaPlayer");
		player.play();
		Date date = (Date)ctx.getBean("getDate");
		System.out.println(date);
		java.sql.Date sdate = (java.sql.Date)ctx.getBean("getSqlDate");
		System.out.println(sdate);
		ctx.close();
	}

}
