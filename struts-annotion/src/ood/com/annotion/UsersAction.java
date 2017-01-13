package ood.com.annotion;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsersAction extends ActionSupport {

	private static final long serialVersionUID = 50391347878519761L;
	private String username;
	private String password;

	/*
	 * value的值是path，页面from的action的值对应
	 * 
	 * @result 返回结果 name 跳转地址别名 location具体跳转地址
	 */

	@Action(value = "/users", results = { @Result(name = "success", location = "/results/success.jsp") })
	public String execute() {
		System.out.println("----------------------------");
		return SUCCESS;
	}

}
