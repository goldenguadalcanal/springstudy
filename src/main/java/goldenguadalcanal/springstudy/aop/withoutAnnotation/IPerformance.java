package goldenguadalcanal.springstudy.aop.withoutAnnotation;

/**
 * 表演接口
 * @author bilei
 *
 */
public interface IPerformance {
	
	public void perform();
	
	public void perform(String performer,String instrument);
	
	public String showInstrument();
}
