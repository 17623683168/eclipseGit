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
		//����һ���γ̶��󣬵���add������ӿγ̵�list��
		Course cr1=new Course("1","���ݿ�ѧϰ");
		coursesListTest.add(cr1);
	/*
	 * ��ӽ�ȥ��ʱ����Object���ͣ���Ҫʹ������ǿת
	 */
		Course temp=(Course)coursesListTest.get(0);
		//System.out.println("����˿γ�  id:"+temp.id + " �γ���:" + temp.name);
		
		Course cr2=new Course("2","java����");
		coursesListTest.add(0,cr2);
		Course temp2=(Course)coursesListTest.get(0);
		//System.out.println("����˿γ�  id:"+temp2.id + " �γ���:" + temp2.name);
		
		coursesListTest.add(cr1);
	/*
	 * ��ӽ�ȥ��ʱ����Object���ͣ���Ҫʹ������ǿת
	 */
		Course temp0=(Course)coursesListTest.get(2);
		//System.out.println("����˿γ�  id:"+temp0.id + " �γ���:" + temp0.name);
		
	/*ʹ��addAll���һ�����鼯��
	 * 
	 */
		Course[]course= {new Course("3","PHPѧϰ"),new Course("4","mySqlѧϰ")};
		coursesListTest.addAll(Arrays.asList(course));	
		Course temp3=(Course)coursesListTest.get(3);
		Course temp4=(Course)coursesListTest.get(4);
		//System.out.println("����˿γ�  id:"+temp3.id + " �γ���:" + temp3.name +" id:"+ temp4.id + " �γ���: "+ temp4.name);
	
		Course[]course2= {new Course("5","C++ѧϰ"),new Course("6","Pythonѧϰ")};
		coursesListTest.addAll(2,Arrays.asList(course2));	
		Course temp5=(Course)coursesListTest.get(2);
		Course temp6=(Course)coursesListTest.get(3);
		//System.out.println("����˿γ�  id:"+temp5.id + " �γ���:" + temp5.name +" id:"+ temp6.id + " �γ���: "+ temp6.name);
	}
	public void  testForeach() {
		System.out.println("�����¿γ�(Foreach����)");
		for(Object obj:coursesListTest) {
			Course cr4=(Course)obj;
		System.out.println("�γ�:"+cr4.id+":"+cr4.name);
		}
	}
	
	public void testContains() {
		Course course =coursesListTest.get(0);
		System.out.println("ȡ�ÿγ�:"+course.name);
		System.out.println("��ѡ�γ����Ƿ�����γ�:"+course.name+";"+coursesListTest.contains(course));
		
		System.out.println("������γ�����:");
		String name=console.next();
		
		Course course2=new Course();
		course2.name=name;
		
		System.out.println("��ȡ�ÿγ�:"+course2.name);
		System.out.println("��ѡ�γ����Ƿ�����γ�:"+course2.name+";"+coursesListTest.contains(course2));
		
		if(coursesListTest.contains(course2)) {
			System.out.println("�γ̣�"+course2.name+":"+coursesListTest.indexOf(course2));
		}
	}
	
	public void testSet() {
		//����һ���µ�ѧ������
		student=new Student("1","С��");
		System.out.println("��ӭѧ��:"+student.name+"ѡ��");
		//����Scanner�������ڽ��ռ�������Ŀγ�Id;
		Scanner console=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("������γ�ID");
			String courseId=console.next();
			//�������������Ҫʵ���������static
			for(Course cr:coursesListTest) {
				if(cr.id.equals(courseId)) {
					student.courses.add(cr);
				}
			}
		}
	}
	public void testSetContains() {
		System.out.println("��������ѡ�γ�����:");
			String name=console.next();
			Course course2=new Course();
			course2.name=name;
			System.out.println("��ȡ�ÿγ�:"+course2.name);
			System.out.println("��ѡ�γ����Ƿ�����γ�:"+course2.name+";"+student.courses.contains(course2));
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
//		//��ѧ�γ̣�
	}
	public void testForSet(Student student) {
		System.out.println("��ѡ���ˣ�"+student.courses.size()+"�ſγ�");
		for(Course cr:student.courses) {
			System.out.println("ѡ��γ�Ϊ��"+cr.id+cr.name );
		}
	}
}
