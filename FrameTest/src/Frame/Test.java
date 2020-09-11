package Frame;

import java.util.ArrayList;
import java.util.List;
//测试git
public class Test {
	/*
	 * 通过泛型，规定list添加内容
	 * */
	public List<Course>courses;
	
	public Test(){
		this.courses=new ArrayList<Course>();
	}
	public void testAdd() {
		Course cr1=new Course("1","tset");
		courses.add(cr1);
		
		Course cr2=new Course("2","tset2");
		courses.add(cr2);
	}
	public void testForeach() {
		for(Course cr3:courses) {
			System.out.println(cr3.id+":"+cr3.name);
		}
	}
	public void testChild() {
		ChildCourse ccr=new ChildCourse();
		ccr.id="3";
		ccr.name="ttest3";
		courses.add(ccr);
	}
	public static void main(String[]args) {
		Test t1=new Test();
		t1.testAdd();
		t1.testForeach();
		t1.testChild();
		t1.testForeach();
	}
}
