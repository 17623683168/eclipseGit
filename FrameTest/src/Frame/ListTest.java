package Frame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//备选课程类
public class ListTest {
	//用于备选课程的List
	public List coursesListTest;
	
	public ListTest() {
		//ArrayList 是List接口的重要实现类
		this.coursesListTest=new ArrayList();
	}
	//创建一个testAdd方法，用于往coursesListTest中添加内容
	public void testAdd() {
		//创建一个课程对象，调用add方法添加课程到list中
		Course cr1=new Course("1","数据库学习");
		coursesListTest.add(cr1);
	/*
	 * 添加进去的时候是Object类型，需要使用类型强转
	 */
		Course temp=(Course)coursesListTest.get(0);
		System.out.println("添加了课程  id:"+temp.id + " 课程名:" + temp.name);
		
		Course cr2=new Course("2","java入门");
		coursesListTest.add(0,cr2);
		Course temp2=(Course)coursesListTest.get(0);
		System.out.println("添加了课程  id:"+temp2.id + " 课程名:" + temp2.name);
		
		coursesListTest.add(cr1);
	/*
	 * 添加进去的时候是Object类型，需要使用类型强转
	 */
		Course temp0=(Course)coursesListTest.get(2);
		System.out.println("添加了课程  id:"+temp0.id + " 课程名:" + temp0.name);
		
	/*使用addAll添加一个数组集合
	 * 
	 */
		Course[]course= {new Course("3","PHP学习"),new Course("4","mySql学习")};
		coursesListTest.addAll(Arrays.asList(course));	
		Course temp3=(Course)coursesListTest.get(3);
		Course temp4=(Course)coursesListTest.get(4);
		System.out.println("添加了课程  id:"+temp3.id + " 课程名:" + temp3.name +" id:"+ temp4.id + " 课程名: "+ temp4.name);
	
		Course[]course2= {new Course("5","C++学习"),new Course("6","Python学习")};
		coursesListTest.addAll(2,Arrays.asList(course2));	
		Course temp5=(Course)coursesListTest.get(2);
		Course temp6=(Course)coursesListTest.get(3);
		System.out.println("添加了课程  id:"+temp5.id + " 课程名:" + temp5.name +" id:"+ temp6.id + " 课程名: "+ temp6.name);
	}
	/*
	 * 创建一个方法用于去除list元素
	 * */
	public void testGet() {
		int size=coursesListTest.size();
		System.out.println("有如下课程+");
		for(int i=0;i<size;i++) {
		Course cr = (Course)coursesListTest.get(i);
			System.out.println("课程:"+cr.id+":"+cr.name);
		}
	}
	//通过迭代器遍历List
	
	public void testIterator() {
		Iterator it = coursesListTest.iterator();
		System.out.println("有如下课程(迭代器访问)");
		while(it.hasNext()){
		Course cr3 =(Course)it.next();
		System.out.println("课程:"+cr3.id+":"+cr3.name);
		}
	}
	/*
	 * 通过for each遍历集合元素
	 * */
	public void  testForeach() {
		System.out.println("有如下课程(Foreach访问)");
		for(Object obj:coursesListTest) {
			Course cr4=(Course)obj;
		System.out.println("课程:"+cr4.id+":"+cr4.name);
		}
	}
	/*
	 * 修改List中的元素 set
	 */
	public void testSet() {
		coursesListTest.set(4,new Course("7","大学英语"));
	}
	
	/*
	 * 删除List中的元素
	 */
	public void testRemove() {
		/*Course cr5=(Course) coursesListTest.get(4);
		*System.out.println("我是课程 "+cr5.id+" 的 "+cr5.name+" 我即将被删除");
		*/
		Course [] course2= {(Course)coursesListTest.get(4),(Course) coursesListTest.get(5)};
		coursesListTest.removeAll(Arrays.asList(course2));
		//coursesListTest.remove(4);
		System.out.println("成功删除");
		testForeach();
	}
	public static void main(String[]args) {
		//创建ListTest对象调用测试方法
		ListTest l1=new ListTest();
		l1.testAdd();
		l1.testGet();
		l1.testIterator();
		l1.testForeach();
		l1.testSet();
		l1.testForeach();
		l1.testRemove();
	}
}
