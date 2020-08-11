package oops;
import java.util.Scanner;
// encapsulation concept example
public class car extends another {

	public static void main(String[] args) {
		another y=new another();
		Scanner scan=new Scanner(System.in);
		String na=scan.nextLine();
		y.setname(na);
		String n=y.getname();
		System.out.println(n);
		scan.close();

	}

}
