package goldenguadalcanal.springstudy.aop.annotation.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SoloAspect {
	
	@DeclareParents(value="goldenguadalcanal.springstudy.aop.annotation.IPerformance+",defaultImpl=SoloImpl.class)
	private ISolo soloProxy;
	
}
