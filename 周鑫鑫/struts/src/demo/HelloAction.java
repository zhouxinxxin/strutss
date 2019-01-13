package demo;

public class HelloAction implements Action{
private String content;
private String uname;

	public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

	@Override
	public String execute() throws Exception {
		content="ÄãºÃ"+uname;
		return Action.SUCCESS;
	}

}
