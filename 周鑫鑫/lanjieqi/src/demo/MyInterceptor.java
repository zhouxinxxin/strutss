package demo;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("�ҿ�ʼ����");
		String result=invocation.invoke();
		System.out.println("���ش���"+result);
		return result;
	}

}
