package ood.com.struts2.ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
@Setter@Getter
public class OgnlBean {
	public static final String staticProperty = "this is a static property!";
	private String property = "this is a common property!";
	
	private String[]array ={"jack","rose","tom"};
	private List<String>list = new ArrayList<String>();
	private Map<String, String>map = new HashMap<String,String>();
	 
	
	public OgnlBean(){
		list.add("hefei");
		list.add("beijing");
		list.add("shanghai");
		map.put("home", "1111");
		map.put("office", "2222");
		map.put("other", "3333");
		
	}
	public String method(){
		
		return "this is a common method!";
	}
	
	public static String staticMethod(){
		
		return "this is a static method!";
		
	}
	
	
}
