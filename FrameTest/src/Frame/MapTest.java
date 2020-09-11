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
			System.out.println("请输入学生Id:");
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null) {
				System.out.println("请输入学生姓名：");
				String name =console.next();
				Student newStudent = new Student(ID,name);
				students.put(ID,newStudent);
				System.out.println("成功添加学生"+students.get(ID).name);
				i++;
			}else {
				System.out.println("该学生已被占用");
				continue;
			}
		}
	}
	
	public void testKey() {
		Set<String>keySet=students.keySet();
		System.out.println("总共有:"+students.size()+"个学生");
		for(String stID:keySet) {
			Student st=students.get(stID); 
			if(st!=null) {
				System.out.println("学生:"+st.name);
			}
		}
	}
	
	public void testRemove() {
		Scanner console=new Scanner(System.in);
		while(true) {
			System.out.println("请输入要删除的学生ID:");
			String ID =console.next();
			Student	st=students.get(ID);
			if(st==null) {
				System.out.println("ID不存在");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生:"+st.name); 
			break;
		}
	}
	
	public void testEntrySet() {
		Set<Entry<String,Student>>entrySet=students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得键:"+entry.getKey());
			System.out.println("取得值:"+entry.getValue().name);
			
		}
	}
	public void testModify() {
		System.out.println("请输入要修改的学生ID:");
		Scanner console=new Scanner(System.in);
		while(true) {
			String stuID=console.next();
			Student student=students.get(stuID); 
			if(student==null) {
				System.out.println("该id不存在,请重新输入");
				continue;
			}
			System.out.println("当前该学生ID所对应的学生为:"+student.name);
			
			System.out.println("请输入新的学生姓名：");
			String name=console.next();
			Student newStudent=new Student(stuID,name);
			students.put(stuID,newStudent);
			System.out.println("It's ok");
			break;
		}
	}
	
	public void testKeyorValue() {
		System.out.println("请输入要查询的学生ID:");
		Scanner console=new Scanner(System.in);
		String id=console.next();
		System.out.println("输入ID为："+id+"在学生映射表中是否存在:"+students.containsKey(id));
		if(students.containsKey(id)) {
			System.out.println("对应的学生为："+students.get(id).name);
		}
		System.out.println("请输入学生姓名:");
		String name=console.next();
		if(students.containsValue(new Student(null,name)))
			System.out.println("在学生映射表中，学生存在："+name);
		else
			System.out.println("不存在");
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
