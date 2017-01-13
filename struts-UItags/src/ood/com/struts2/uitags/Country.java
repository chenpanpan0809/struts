package ood.com.struts2.uitags;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Country {
	
	private int countryId;
	private String countryName;
	public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}
}
