import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author JiHongwei
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// aspectBusiness����bean����Spring�Զ����ɵ�
		BusinessInter business = (BusinessInter) context
				.getBean("aspectBusiness");
		business.addStudent("����ΰ");
	}

}
