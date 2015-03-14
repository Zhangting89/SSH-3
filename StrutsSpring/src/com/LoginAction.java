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
		ActionInter business = (ActionInter) context
				.getBean("aspectBusiness");

		System.out.println("username:"+ user.getUsername());
		
		if (business.login(user)) {
			ac.put("success", "��¼�ɹ�");
			return "success";
		} else {
			ac.put("error", "��¼ʧ��");
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
