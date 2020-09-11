package Frame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//��ѡ�γ���
public class ListTest {
	//���ڱ�ѡ�γ̵�List
	public List coursesListTest;
	
	public ListTest() {
		//ArrayList ��List�ӿڵ���Ҫʵ����
		this.coursesListTest=new ArrayList();
	}
	//����һ��testAdd������������coursesListTest���������
	public void testAdd() {
		//����һ���γ̶��󣬵���add������ӿγ̵�list��
		Course cr1=new Course("1","���ݿ�ѧϰ");
		coursesListTest.add(cr1);
	/*
	 * ��ӽ�ȥ��ʱ����Object���ͣ���Ҫʹ������ǿת
	 */
		Course temp=(Course)coursesListTest.get(0);
		System.out.println("����˿γ�  id:"+temp.id + " �γ���:" + temp.name);
		
		Course cr2=new Course("2","java����");
		coursesListTest.add(0,cr2);
		Course temp2=(Course)coursesListTest.get(0);
		System.out.println("����˿γ�  id:"+temp2.id + " �γ���:" + temp2.name);
		
		coursesListTest.add(cr1);
	/*
	 * ��ӽ�ȥ��ʱ����Object���ͣ���Ҫʹ������ǿת
	 */
		Course temp0=(Course)coursesListTest.get(2);
		System.out.println("����˿γ�  id:"+temp0.id + " �γ���:" + temp0.name);
		
	/*ʹ��addAll���һ�����鼯��
	 * 
	 */
		Course[]course= {new Course("3","PHPѧϰ"),new Course("4","mySqlѧϰ")};
		coursesListTest.addAll(Arrays.asList(course));	
		Course temp3=(Course)coursesListTest.get(3);
		Course temp4=(Course)coursesListTest.get(4);
		System.out.println("����˿γ�  id:"+temp3.id + " �γ���:" + temp3.name +" id:"+ temp4.id + " �γ���: "+ temp4.name);
	
		Course[]course2= {new Course("5","C++ѧϰ"),new Course("6","Pythonѧϰ")};
		coursesListTest.addAll(2,Arrays.asList(course2));	
		Course temp5=(Course)coursesListTest.get(2);
		Course temp6=(Course)coursesListTest.get(3);
		System.out.println("����˿γ�  id:"+temp5.id + " �γ���:" + temp5.name +" id:"+ temp6.id + " �γ���: "+ temp6.name);
	}
	/*
	 * ����һ����������ȥ��listԪ��
	 * */
	public void testGet() {
		int size=coursesListTest.size();
		System.out.println("�����¿γ�+");
		for(int i=0;i<size;i++) {
		Course cr = (Course)coursesListTest.get(i);
			System.out.println("�γ�:"+cr.id+":"+cr.name);
		}
	}
	//ͨ������������List
	
	public void testIterator() {
		Iterator it = coursesListTest.iterator();
		System.out.println("�����¿γ�(����������)");
		while(it.hasNext()){
		Course cr3 =(Course)it.next();
		System.out.println("�γ�:"+cr3.id+":"+cr3.name);
		}
	}
	/*
	 * ͨ��for each��������Ԫ��
	 * */
	public void  testForeach() {
		System.out.println("�����¿γ�(Foreach����)");
		for(Object obj:coursesListTest) {
			Course cr4=(Course)obj;
		System.out.println("�γ�:"+cr4.id+":"+cr4.name);
		}
	}
	/*
	 * �޸�List�е�Ԫ�� set
	 */
	public void testSet() {
		coursesListTest.set(4,new Course("7","��ѧӢ��"));
	}
	
	/*
	 * ɾ��List�е�Ԫ��
	 */
	public void testRemove() {
		/*Course cr5=(Course) coursesListTest.get(4);
		*System.out.println("���ǿγ� "+cr5.id+" �� "+cr5.name+" �Ҽ�����ɾ��");
		*/
		Course [] course2= {(Course)coursesListTest.get(4),(Course) coursesListTest.get(5)};
		coursesListTest.removeAll(Arrays.asList(course2));
		//coursesListTest.remove(4);
		System.out.println("�ɹ�ɾ��");
		testForeach();
	}
	public static void main(String[]args) {
		//����ListTest������ò��Է���
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
