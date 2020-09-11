package Frame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class testInteger {
	
	public void testSort() {
	List<Integer> intList=new ArrayList<Integer>();
	Random random=new Random();
	Integer k;
	for(int i=0;i<10;i++) {
		do {
			k=random.nextInt(100);
		} while (intList.contains(k));
			intList.add(k);
			System.out.println("成功添加："+k);
		}
		System.out.println("------------排序前------------");
		for(Integer integer:intList) {
			System.out.println("内容："+integer);
		}
		Collections.sort(intList);
		System.out.println("------------排序后------------");
		for(Integer integer:intList) {
			System.out.println("内容："+integer);
		}
	}
	public void stSort() {
		List<String>stList=new ArrayList<String>();
		stList.add("BMW");
		stList.add("Volvo");
		stList.add("Porsche");
		System.out.println("------------排序前------------");
		for(String string:stList) {
			System.out.println("元素："+string);
		}
		Collections.sort(stList);
		System.out.println("------------排序后------------");
		for(String string:stList) {
			System.out.println("元素："+string);
		}
	}
	public void obSort() {
		List<Student>stuList=new ArrayList<Student>();
		Random random=new Random();
		
		stuList.add(new Student(random.nextInt(1000)+",","aack"));
		stuList.add(new Student(random.nextInt(1000)+",","bom"));
		stuList.add(new Student(random.nextInt(1000)+",","cucy"));
		stuList.add(new Student(90000+"","ducy"));
		System.out.println("------------排序前------------");
		for(Student student:stuList) {
			System.out.println("学生:"+student.id+"："+student.name);
		}
		System.out.println("------------排序后------------");
		Collections.sort(stuList);
		for(Student student:stuList) {
			System.out.println("学生:"+student.id+"："+student.name);
		}
		Collections.sort(stuList,new StuCpt());
		System.out.println("********按照姓名排序后********");
		for(Student student:stuList) {
			System.out.println("学生:"+student.id+"："+student.name);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testInteger ti= new testInteger();
		//ti.testSort();
		ti.stSort() ;
		ti.obSort();
	}

}
