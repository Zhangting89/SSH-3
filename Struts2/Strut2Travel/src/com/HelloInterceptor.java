package com;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class HelloInterceptor extends AbstractInterceptor{

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("��������ʼ����");
		String resultString = invocation.invoke();
		System.out.println("����������");

		return resultString;
	}

}
