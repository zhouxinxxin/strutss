package demo;

public class HelloWorldAction implements Action{//ʵ��Action�ӿ�
private String content;//�����Ӧ�������

	

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
