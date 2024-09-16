package com.hamsa.learning.annotations;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Course {
	String cid() default "CS001";

	String cname() default "JAVA PROGRAMMING";

	float cfee() default 20000;
}

@Course(cid = "1001", cname = "MICROSERVICE", cfee = 30000)
class Student1 {
	String sid;
	String sname;
	String sloc;

	public Student1(String sid, String sname, String sloc) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sloc = sloc;
	}

	public String display() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", sloc=" + sloc + "]";
	}
}

public class College {
	public static void main(String[] args) {
		Student1 std = new Student1("123", "Mallikarjuna", "Mysuru");
		System.out.println(std.display());
		Class c = std.getClass();
		Annotation ann = c.getAnnotation(Course.class);
		Course course = (Course) ann;
		System.out.println("Student details course");
		System.out.println(
				"Course Id: " + course.cid() + "Course Name: " + course.cname() + " Course cost: " + course.cfee());
	}

}
