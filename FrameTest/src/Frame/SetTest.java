package Frame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	 
	public List<Course>coursesListTest;
	
	public Scanner console;
	public Student student;
	public SetTest() {
		coursesListTest=new ArrayList<Course>();
		console=new Scanner(System.in);
	}
	
	public void testAdd() {
		//创建一个课程对象，调用add方法添加课程到list中
		Course cr1=new Course("1","数据库学习");
		coursesListTest.add(cr1);
	/*
	 * 添加进去的时候是Object类型，需要使用类型强转
	 */
		Course temp=(Course)coursesListTest.get(0);
		//System.out.println("添加了课程  id:"+temp.id + " 课程名:" + temp.name);
		
		Course cr2=new Course("2","java入门");
		coursesListTest.add(0,cr2);
		Course temp2=(Course)coursesListTest.get(0);
		//System.out.println("添加了课程  id:"+temp2.id + " 课程名:" + temp2.name);
		
		coursesListTest.add(cr1);
	/*
	 * 添加进去的时候是Object类型，需要使用类型强转
	 */
		Course temp0=(Course)coursesListTest.get(2);
		//System.out.println("添加了课程  id:"+temp0.id + " 课程名:" + temp0.name);
		
	/*使用addAll添加一个数组集合
	 * 
	 */
		Course[]course= {new Course("3","PHP学习"),new Course("4","mySql学习")};
		coursesListTest.addAll(Arrays.asList(course));	
		Course temp3=(Course)coursesListTest.get(3);
		Course temp4=(Course)coursesListTest.get(4);
		//System.out.println("添加了课程  id:"+temp3.id + " 课程名:" + temp3.name +" id:"+ temp4.id + " 课程名: "+ temp4.name);
	
		Course[]course2= {new Course("5","C++学习"),new Course("6","Python学习")};
		coursesListTest.addAll(2,Arrays.asList(course2));	
		Course temp5=(Course)coursesListTest.get(2);
		Course temp6=(Course)coursesListTest.get(3);
		//System.out.println("添加了课程  id:"+temp5.id + " 课程名:" + temp5.name +" id:"+ temp6.id + " 课程名: "+ temp6.name);
	}
	public void  testForeach() {
		System.out.println("有如下课程(Foreach访问)");
		for(Object obj:coursesListTest) {
			Course cr4=(Course)obj;
		System.out.println("课程:"+cr4.id+":"+cr4.name);
		}
	}
	
	public void testContains() {
		Course course =coursesListTest.get(0);
		System.out.println("取得课程:"+course.name);
		System.out.println("备选课程中是否包含课程:"+course.name+";"+coursesListTest.contains(course));
		
		System.out.println("请输入课程名称:");
		String name=console.next();
		
		Course course2=new Course();
		course2.name=name;
		
		System.out.println("新取得课程:"+course2.name);
		System.out.println("备选课程中是否包含课程:"+course2.name+";"+coursesListTest.contains(course2));
		
		if(coursesListTest.contains(course2)) {
			System.out.println("课程："+course2.name+":"+coursesListTest.indexOf(course2));
		}
	}
	
	public void testSet() {
		//创建一个新的学生对象
		student=new Student("1","小明");
		System.out.println("欢迎学生:"+student.name+"选课");
		//创建Scanner对象，用于接收键盘输入的课程Id;
		Scanner console=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("请输入课程ID");
			String courseId=console.next();
			//访问其他类变量要实例化对象或static
			for(Course cr:coursesListTest) {
				if(cr.id.equals(courseId)) {
					student.courses.add(cr);
				}
			}
		}
	}
	public void testSetContains() {
		System.out.println("请输入已选课程名称:");
			String name=console.next();
			Course course2=new Course();
			course2.name=name;
			System.out.println("新取得课程:"+course2.name);
			System.out.println("备选课程中是否包含课程:"+course2.name+";"+student.courses.contains(course2));
	}
	public static void main(String[]args) {
		SetTest s1=new SetTest();
		s1.testAdd();
		s1.testContains();
		s1.testForeach();
//		
//		s1.testForSet(student);
		//s1.testSet();
		//s1.testSetContains(); 
//		//所学课程！
	}
	public void testForSet(Student student) {
		System.out.println("共选择了："+student.courses.size()+"门课程");
		for(Course cr:student.courses) {
			System.out.println("选择课程为："+cr.id+cr.name );
		}
	}
}
