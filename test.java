/**
 * 
 */
package test;

import java.util.Scanner;
// to create object and class
public class test {
	int rollno;
	String name;
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		test s=new test();
		s.rollno=scan.nextInt();
		s.name=scan.next();
		System.out.println(s.name);
		System.out.println(s.rollno);
		scan.close();
	}
	

}