package goldenguadalcanal.springstudy.aop.withoutAnnotation;

import goldenguadalcanal.springstudy.Loader;

public class App {

	public static final String conf = "spring-aop-withoutAnnotation.xml";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPerformance g = (IPerformance)Loader.getContext(conf).getBean("guitar");
		g.perform();
		g = (IPerformance)Loader.getContext(conf).getBean("drum");
		//throwing exception
		g.perform();
		
		g.showInstrument();
		
		g.perform("Tommy Lee", "Pearl Drum");
		
	}

}
