package demo;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class HelloInterceptor extends AbstractInterceptor{

	//��������������

	/**
	 * 
	 */
	private static final long serialVersionUID = 898171939800198363L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("***��������ʼִ��***");
		String resultString=arg0.invoke();
		System.out.println("***������ִ�����***");
		return resultString;
	}

}
