package ood.com.struts2.ognl;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;


public class OgnlTest2 {

	public static void main(String[] args) throws OgnlException {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		OgnlBean bean = new OgnlBean();
		OgnlContext context = new OgnlContext();
		context.put("bean", bean);
		
		
		out.println(Ognl.getValue("'hello!'", context));
		out.println(Ognl.getValue("'A!'", context));
		out.println(Ognl.getValue("'88!'", context));
		out.println(Ognl.getValue("'true!'", context));
		out.println(Ognl.getValue("'null!'", context));
		
	out.println(Ognl.getValue("'#name=zhangsan'", context));
	/*
	*/
	out.println(Ognl.getValue("bean.property", context));
	/*
	*/
	out.println(Ognl.getValue("bean.method()", context));
	/*
	*/
	out.println(Ognl.getValue("@ood.com.struts2.ognl.OgnlBean@staticProperty", context));
	out.println(Ognl.getValue("@ood.com.struts2.ognl.OgnlBean@staticMethod()", context));
	/*
	
	*/
	
	out.println(Ognl.getValue("(new java.lang.String(\"Instance a new object!\")).toString()", context));
	/*获取bean中的数组元素
	*/
	
	out.println(Ognl.getValue("bean.getArray()[0]",context));
	out.println(Ognl.getValue("bean.array[0]",context));
	/*
	
	list
	*/
	out.println(Ognl.getValue("bean.getList()[0]",context));
	out.println(Ognl.getValue("bean.list[0]",context));
	/*
	map
	*/
	
	out.println(Ognl.getValue("bean.getMap()['home']",context));
	out.println(Ognl.getValue("bean.map['home']",context));
	out.println(Ognl.getValue("bean.getMap().office",context));
	out.println(Ognl.getValue("bean.map.office",context));
	/*
	数组
	*/
	
	int[] array = (int[])Ognl.getValue("new int[]{1,2,3,4,5}", context);
	out.println(Arrays.toString(array));
	
	/*
	list
	*/
	List list = (List) Ognl.getValue("{0,1,2,3,4}", context);
	out.println(list);
	
	/*
	map
	*/
	
	Map map = (Map) Ognl.getValue("#{'key1':'value1','key2':'value2','key3':'value3'}", context);
	out.println(map);
	/*
	放置list
	*/
	List<Teacher> teacherList = new ArrayList<Teacher>();
	teacherList.add(new Teacher("jack1", 2000));
	teacherList.add(new Teacher("jack2", 2200));
	teacherList.add(new Teacher("jack3", 2300));
	teacherList.add(new Teacher("jack4", 2400));
	teacherList.add(new Teacher("jack5", 2500));
	teacherList.add(new Teacher("jack6", 2600));
	context.put("teacherList", teacherList);
	
	//
	out.println(Ognl.getValue("teacherList.{name}", context));
	out.println(Ognl.getValue("teacherList.{#this.name.toUpperCase()}", context));
	out.println(Ognl.getValue("teacherList.{#this.salary>2500?#this.salary:#this.salary+99}", context));
	
	//
	out.println(Ognl.getValue("teacherList.{?#this.salary>2500}", context));
	out.println(Ognl.getValue("teacherList.{?#this.salary>2500}[0]", context));
	out.println(Ognl.getValue("teacherList.{^#this.salary>2500}", context));
	out.println(Ognl.getValue("teacherList.{$#this.salary>2500}", context));
	
	}

}
