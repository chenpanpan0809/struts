package ood.com.struts2.ognl;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

}
