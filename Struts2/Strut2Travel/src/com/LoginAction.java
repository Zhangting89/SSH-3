package com;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;

	// actionĬ�ϵ���
	// public String execute() {
	// if (user.getUsername().equals("123") && user.getUserpass().equals("123"))
	// {
	// return "success";
	// } else {
	// return "error";
	// }
	// }

	// ������������
	// private String username;
	// private String userpass;
	// public String getUsername() {
	// return username;
	// }
	// public void setUsername(String username) {
	// this.username = username;
	// }
	// public String getUserpass() {
	// return userpass;
	// }
	// public void setUserpass(String userpass) {
	// this.userpass = userpass;
	// }

	// ����model������
	private User user = new User();

	public String login() throws Exception {
		ActionContext ac = ActionContext.getContext();
		if (user.getUsername().equals("123")
				&& user.getUserpass().equals("123")) {
			// if (username.equals("123") && userpass.equals("123")) {
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
