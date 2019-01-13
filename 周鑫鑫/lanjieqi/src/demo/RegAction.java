package demo;

public class RegAction {
private String userName;
private String password1;
public String execute(){
	System.out.println("------注册的用户信息如下------");
	System.out.println("用户名"+userName);
	System.out.println("密码"+password1);
	return "ok";
	
	
}
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
	this.password1 = password1;
}


}
