package goldenguadalcanal.springstudy.aop;

import goldenguadalcanal.springstudy.Loader;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IPerformance g = (IPerformance)Loader.getInstance().getBean("guitar");
		//g.perform();
		IPerformance g = (IPerformance)Loader.getInstance().getBean("drum");
		g.perform();
		
	}

}
