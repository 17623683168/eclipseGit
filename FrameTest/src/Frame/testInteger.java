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
			System.out.println("�ɹ���ӣ�"+k);
		}
		System.out.println("------------����ǰ------------");
		for(Integer integer:intList) {
			System.out.println("���ݣ�"+integer);
		}
		Collections.sort(intList);
		System.out.println("------------�����------------");
		for(Integer integer:intList) {
			System.out.println("���ݣ�"+integer);
		}
	}
	public void stSort() {
		List<String>stList=new ArrayList<String>();
		stList.add("BMW");
		stList.add("Volvo");
		stList.add("Porsche");
		System.out.println("------------����ǰ------------");
		for(String string:stList) {
			System.out.println("Ԫ�أ�"+string);
		}
		Collections.sort(stList);
		System.out.println("------------�����------------");
		for(String string:stList) {
			System.out.println("Ԫ�أ�"+string);
		}
	}
	public void obSort() {
		List<Student>stuList=new ArrayList<Student>();
		Random random=new Random();
		
		stuList.add(new Student(random.nextInt(1000)+",","aack"));
		stuList.add(new Student(random.nextInt(1000)+",","bom"));
		stuList.add(new Student(random.nextInt(1000)+",","cucy"));
		stuList.add(new Student(90000+"","ducy"));
		System.out.println("------------����ǰ------------");
		for(Student student:stuList) {
			System.out.println("ѧ��:"+student.id+"��"+student.name);
		}
		System.out.println("------------�����------------");
		Collections.sort(stuList);
		for(Student student:stuList) {
			System.out.println("ѧ��:"+student.id+"��"+student.name);
		}
		Collections.sort(stuList,new StuCpt());
		System.out.println("********�������������********");
		for(Student student:stuList) {
			System.out.println("ѧ��:"+student.id+"��"+student.name);
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
