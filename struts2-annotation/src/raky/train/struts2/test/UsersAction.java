package raky.train.struts2.test;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;


public class UsersAction extends ActionSupport {

	private static final long serialVersionUID = 5039134787852719761L;
	private String username;
	private String password;
	
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

	/**
	 * value的值是path，页面form的action的值对应
	 * @Result 返回结果
	 * name 跳转地址别名
	 * location 具体跳转地址
	 * 
	 */
	@Action(value="/users",results={@Result(name="success",location="/results/success.jsp")})
	public String execute() {
		return SUCCESS;
	}

}
