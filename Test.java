package experiment4;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class Test {
	static StudentInformation student0=new StudentInformation();
	
	static FileOperation file = new FileOperation();
	public static void main(String[] args) {
		
		  //System.out.println("���Ĵ�ʵ�飺�ļ�����");
		  System.out.println("**********ѧ����Ϣ¼��**********");
		  student0.inputInformation(); 
		  System.out.println("\n\n������Ϣ��");
		  System.out.println("���� �Ա� ���� ѧ��");
    	  System.out.println(student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.stuNum);
		
		String a=file.readFile();
		String b = file.operationFile(a);
		if(file.outFile(addNewInformation(student0)))
		System.out.println("��Ϣ����ɹ���");
		if(file.outFile(b))
			System.out.println("��ҵ����ɹ���");

	}
	public static String addNewInformation(StudentInformation student) {
		String information = null;
		information="������Ϣ��\n����     �Ա�     ����     ѧ��\n"+student0.name+"  "+student0.sex+"  "+student0.age+"  "+student0.stuNum+"\n�����ҵ��\n";
		 return information;
	}
}
