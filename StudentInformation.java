package experiment4;
import java.util.Scanner;
public class StudentInformation {
	String name;
	String sex;
	int age;
	String stuNum;

public void inputInformation() {
	
	a:for(;;) {
		try {
			Scanner reader1 = new Scanner(System.in);
			System.out.println("����������");
	        name=reader1.nextLine();
	        System.out.println("¼��ɹ�");
	        break a;
		}
		catch(Exception e) {
			System.out.println("������� ��"+name+"�� ��ʽ����ȷ�����������룡");
		}
	}
	b:for(;;) {
	try{
	Scanner reader2 = new Scanner(System.in);
	System.out.println("�������Ա����ģ�");
	sex=reader2.nextLine();
	sexJudge(sex);
	break b;
	}
	catch(JudgeException e) {
		System.out.println(e.JudgeException(sex));
	}
	}
	c:for(;;) {
		try{
			Scanner reader3 = new Scanner(System.in);
			System.out.println("���������䣨15-35�꣩");
			age=reader3.nextInt();
		    ageJudge(age);
		    break c;
		}
		catch(JudgeException e) {
			System.out.println(e.JudgeException(age));
		}
		}
	d:for(;;) {
		try {
			Scanner reader= new Scanner(System.in);
			System.out.println("������ѧ��");
			stuNum=reader.nextLine();
	        System.out.println("¼��ɹ�");
	        break d;
		}
		catch(Exception e) {
			System.out.println("������ġ�"+stuNum+"����ʽ����ȷ�����������룡");
		}
	}
	
}
public void sexJudge(String sex) throws JudgeException{
	String x="��";
	String y="Ů";
	if (sex.equals(x)||sex.equals(y)){
		System.out.println("¼��ɹ�");
		}
	else throw new JudgeException();
}
public void ageJudge(int age) throws JudgeException{
	int x=15;
	int y=35;
	if (age>=x&&age<=y){
		System.out.println("¼��ɹ�");
		}
	else throw new JudgeException();
}

}

