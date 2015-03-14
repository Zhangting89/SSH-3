package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;

	// ����model������
	private User user = new User();

	public String login() throws Exception {
		ActionContext ac = ActionContext.getContext();

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// aspectBusiness����bean����Spring�Զ����ɵ�
		DaoInter hdao = (DaoInter) context.getBean("aspectBusiness");

		// HibernateDAO hdao = new HibernateDAO();
		 
		System.out.println("username:" + user.getLoginName());

		if (hdao.testLoad(user)) {
			System.out.println("invocate testLoad()");
			ac.put("success", "��¼�ɹ�");
			System.out.println("loginAction return success");
			return "success";
		} else {
			ac.put("error", "��¼ʧ��");
			System.out.println("loginAction return false");
			return "error";
		}
	}

	public String register() {
		ActionContext.getContext().put("message", "ע��ɹ�");
		return "success";
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	

}
