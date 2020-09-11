package Frame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	public Map<String,Student>students;
	
	public MapTest() {
		this.students=new HashMap<String,Student>();
	}
	public void testPut() {
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("������ѧ��Id:");
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null) {
				System.out.println("������ѧ��������");
				String name =console.next();
				Student newStudent = new Student(ID,name);
				students.put(ID,newStudent);
				System.out.println("�ɹ����ѧ��"+students.get(ID).name);
				i++;
			}else {
				System.out.println("��ѧ���ѱ�ռ��");
				continue;
			}
		}
	}
	
	public void testKey() {
		Set<String>keySet=students.keySet();
		System.out.println("�ܹ���:"+students.size()+"��ѧ��");
		for(String stID:keySet) {
			Student st=students.get(stID); 
			if(st!=null) {
				System.out.println("ѧ��:"+st.name);
			}
		}
	}
	
	public void testRemove() {
		Scanner console=new Scanner(System.in);
		while(true) {
			System.out.println("������Ҫɾ����ѧ��ID:");
			String ID =console.next();
			Student	st=students.get(ID);
			if(st==null) {
				System.out.println("ID������");
				continue;
			}
			students.remove(ID);
			System.out.println("�ɹ�ɾ��ѧ��:"+st.name); 
			break;
		}
	}
	
	public void testEntrySet() {
		Set<Entry<String,Student>>entrySet=students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ�ü�:"+entry.getKey());
			System.out.println("ȡ��ֵ:"+entry.getValue().name);
			
		}
	}
	public void testModify() {
		System.out.println("������Ҫ�޸ĵ�ѧ��ID:");
		Scanner console=new Scanner(System.in);
		while(true) {
			String stuID=console.next();
			Student student=students.get(stuID); 
			if(student==null) {
				System.out.println("��id������,����������");
				continue;
			}
			System.out.println("��ǰ��ѧ��ID����Ӧ��ѧ��Ϊ:"+student.name);
			
			System.out.println("�������µ�ѧ��������");
			String name=console.next();
			Student newStudent=new Student(stuID,name);
			students.put(stuID,newStudent);
			System.out.println("It's ok");
			break;
		}
	}
	
	public void testKeyorValue() {
		System.out.println("������Ҫ��ѯ��ѧ��ID:");
		Scanner console=new Scanner(System.in);
		String id=console.next();
		System.out.println("����IDΪ��"+id+"��ѧ��ӳ������Ƿ����:"+students.containsKey(id));
		if(students.containsKey(id)) {
			System.out.println("��Ӧ��ѧ��Ϊ��"+students.get(id).name);
		}
		System.out.println("������ѧ������:");
		String name=console.next();
		if(students.containsValue(new Student(null,name)))
			System.out.println("��ѧ��ӳ����У�ѧ�����ڣ�"+name);
		else
			System.out.println("������");
	}
	public static void main(String[]args) {
		MapTest mt =new MapTest();
		mt.testPut();
		mt.testKey();
		//mt.testRemove();
		//mt.testEntrySet();
		//mt.testModify();
		//mt.testEntrySet();
		mt.testKeyorValue();
	}
}
