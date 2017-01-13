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
	 * value��ֵ��path��ҳ��from��action��ֵ��Ӧ
	 * 
	 * @result ���ؽ�� name ��ת��ַ���� location������ת��ַ
	 */

	@Action(value = "/users", results = { @Result(name = "success", location = "/results/success.jsp") })
	public String execute() {
		System.out.println("----------------------------");
		return SUCCESS;
	}

}
