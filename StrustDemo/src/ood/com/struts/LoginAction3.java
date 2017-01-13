package ood.com.struts;

import lombok.Getter;
import lombok.Setter;


@Getter@Setter
public class LoginAction3 {
 
	private String username;
	private String password;
	
	
	public String execute(){
		if (this.getUsername().equals("admin")&&this.getPassword().equals("password")) {
			return "success";
		}
		
		return "error";
	}
	
	
}
