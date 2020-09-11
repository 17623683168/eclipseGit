package Frame;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Student implements Comparable<Student>{
	/*
	 * 创建学生类
	 * */
	public String id;
	public String name;
	
	//创建一个Set接口用于储存一个课程表信息；
	public  Set<Course> courses;
	private Scanner console;
	
	
	public Student(String id,String name) {
		 this.id=id;
		 this.name=name;
		 //HashSet是Set接口的重要实现类
		 this.courses=new HashSet<Course>();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}
}
