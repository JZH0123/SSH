package cap.bean;
/**
* @author ����:
* @createDate ����ʱ�䣺2018��7��5�� ����3:36:37
*/
public class Test {
	private int id;
	private String username;
	private String password;

	public Test() {
	}
	
	public Test( String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Test(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
 