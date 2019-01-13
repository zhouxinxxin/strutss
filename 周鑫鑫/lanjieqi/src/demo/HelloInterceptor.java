package demo;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class HelloInterceptor extends AbstractInterceptor{

	//À¹½ØÆ÷½øÐÐÀ¹½Ø

	/**
	 * 
	 */
	private static final long serialVersionUID = 898171939800198363L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("***À¹½ØÆ÷¿ªÊ¼Ö´ÐÐ***");
		String resultString=arg0.invoke();
		System.out.println("***À¹½ØÆ÷Ö´ÐÐÍê±Ï***");
		return resultString;
	}

}
