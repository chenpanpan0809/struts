package ood.com.struts2.struts2ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import lombok.Getter;
import lombok.Setter;
import ood.com.struts2.ognl.Student;
import ood.com.struts2.ognl.Teacher;
@Getter@Setter
public class OgnlAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String greeting;
	 
	private List<Person>persons = new ArrayList<Person>();
	
	private void initData(){
		Address address1 = new Address("�й�","�Ϸ�","������11��");
		Address address2 = new Address("�й�","�Ϻ�","�ֶ���122��");
		Address address3 = new Address("�й�","����","������225��");
		
		String[] alias1 ={"С��","����"};
		String[] alias2 ={"С¬","����"};
		String[] alias3 ={"С��","ŶŶ"};
		
		
		List<String>email1 = new ArrayList<String>();
		email1.add("zhangsan@163.com");
		email1.add("zhangsan@qq.com");
		List<String>email2 = new ArrayList<String>();
		email1.add("lisi@163.com");
		email1.add("lisi@qq.com");
		List<String>email3 = new ArrayList<String>();
		email1.add("wangwu@163.com");
		email1.add("wangwu@qq.com");
		
		Map<String, String> phone1 = new HashMap<String,String>();
		phone1.put("home", "1205212");
		phone1.put("office", "0724153536");
		Map<String, String> phone2 = new HashMap<String,String>();
		phone1.put("home", "2544441");
		phone1.put("office", "2505454");
		Map<String, String> phone3 = new HashMap<String,String>();
		phone1.put("home", "366651");
		phone1.put("office", "9855441");
		
		Person person1 = new Person("����",33,333,address1,alias1,email1,phone1);
		Person person2 = new Person("����",44,444,address2,alias2,email2,phone2);
		Person person3 = new Person("����",55,555,address3,alias3,email3,phone3);
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		
		
	}
	@SuppressWarnings({"unchecked","rawtypes"})
	@Override
	public String execute(){
		initData();
		valueStack();
		
		ActionContext actionContext = ActionContext.getContext();
		Map request = actionContext.getContextMap();
		Map session = actionContext.getSession();
		Map application =actionContext.getApplication();
		request.put("personName", persons.get(0).getName());
		session.put("personName", persons.get(1).getName());
		application.put("personName", persons.get(2).getName());
		return SUCCESS;
	}
	public void valueStack(){
		Student stu = new Student("jack",20);
		Teacher tea = new Teacher("scott",40);
		
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		valueStack.push(stu);
		System.out.println(valueStack.findValue("name"));
		valueStack.push(tea);
		System.out.println(valueStack.findValue("name"));
		System.out.println("****");
		System.out.println(valueStack.findValue("score"));
		System.out.println(valueStack.findValue("salary"));
		
		System.out.println("***************");
		valueStack.setValue("name", "rose");
		System.out.println(valueStack.findValue("name"));
		valueStack.setValue("score", "80");
		System.out.println(valueStack.findValue("score"));
		System.out.println("***************");
	}
	
	
}