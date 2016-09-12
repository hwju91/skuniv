package winder.vo;

public class TeamVO {
	
	int tno;
	String name, content, code;
	
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "TeamVO [tno=" + tno + ", name=" + name + ", content=" + content + ", code=" + code + "]";
	}
}
