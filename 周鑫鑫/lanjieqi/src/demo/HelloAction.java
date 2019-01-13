package demo;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String userName;
private String password1;
private String password2;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword1() {
	return password1;
}
public void setPassword1(String password1) {
	this.password1= password1;
}
public String getPassword2() {
	return password2;
}
public void setPassword2(String password2) {
	this.password2= password2;
}
public String execute() throws Exception{
	if ((userName!=null&&userName!="")&&(password1.equals(password2))) {
		System.out.println("验证正确");
		return "success";
	}
	else {
		System.out.println("验证错误");
		return "input";
	}

}
}
