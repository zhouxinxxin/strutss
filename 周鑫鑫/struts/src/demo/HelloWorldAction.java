package demo;

public class HelloWorldAction implements Action{//实现Action接口
private String content;//保存回应结果数据

	

	@Override
	public String execute() throws Exception {
		content="Hello";
		return Action.SUCCESS;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
