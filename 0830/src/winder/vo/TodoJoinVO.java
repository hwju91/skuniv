package winder.vo;

public class TodoJoinVO {
	int tlno;
	String title, content, state, tldate, id;
	public int getTlno() {
		return tlno;
	}
	public void setTlno(int tlno) {
		this.tlno = tlno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTldate() {
		return tldate;
	}
	public void setTldate(String tldate) {
		this.tldate = tldate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "TodoJoinVO [tlno=" + tlno + ", title=" + title + ", content=" + content + ", state=" + state
				+ ", tldate=" + tldate + "]";
	}
	
}
