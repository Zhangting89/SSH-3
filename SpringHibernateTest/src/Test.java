import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibtest1.HibernateInter;
import com.hibtest1.entity.Users;

/**
 * 
 * @author JiHongwei
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// aspectBusiness����bean����Spring�Զ����ɵ�
		HibernateInter business = (HibernateInter) context
				.getBean("aspectBusiness");
		
		Users user = new Users();
		user.setLoginName("senge");
		user.setLoginPwd("456");
		
		business.addUser(user);
		
		System.out.println("complete");
	}

}
