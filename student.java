package test;
import java.util.Scanner;

public class student {
	int rollno;
	String name;
	void getdata(int i, String s)
	{
		rollno=i;
		name=s;
	}
	void display()
	{
		System.out.println("ROllNO:"+rollno+" "+"NAME:"+name);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		student s= new student();
		student s1=new student();
		student s2=new student();
		s.getdata(scan.nextInt(),scan.next());
		s1.getdata(scan.nextInt(),scan.next());
		s2.getdata(scan.nextInt(),scan.next());
		s.display();
		s1.display();
		s2.display();
		
		scan.close();	

	}

}
