package ood.com.struts2.uitags;

import java.util.ArrayList;
import java.util.List;

import com.sun.net.httpserver.Authenticator.Success;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class RegisterAction {
	private static final long serialVersionUID = 409254021890273331L;
	 
	private String userName;
	private String password;
	private String 	gender;
	private String 	about;
	private String 	country;
	private List<Country>countryList;
	private String[]community;
	private List<String>communityList;
	private Boolean mailingList;

	private String SUCCESS;
	
	public String populate(){
		countryList = new ArrayList<Country>();
		countryList.add(new Country(1,"India"));
		countryList.add(new Country(2,"USA"));
		countryList.add(new Country(3,"France"));
		countryList.add(new Country(4,"china"));
		
		
		communityList = new ArrayList<String>();
		communityList.add("Java");
		communityList.add("PHP");
		communityList.add("ASP");
		communityList.add(".net");
		
		
		community = new String[]{"Java",".net"};
		mailingList = true;
		
		return "populate";
		
	}
	public String execute(){
		
		return "success";
		
	}
	
	
}
