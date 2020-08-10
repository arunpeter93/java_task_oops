package test;
import java.util.Scanner;
public class area {
	int l,b,s,r;
	void rectangle(int length,int breadth)
	{
		l=length;
		b=breadth;
	}
	void square(int side)
	{
		s=side;
	}
	void circle(int radius)
	{
		r=radius;
	}
	void area_square()
	{
		System.out.println("area: "+(s*s));
	}
	void area_rectangle()
	{
		System.out.println("area: "+(l*b));
	}
	void area_circle()
	{
		System.out.println("area: "+(r*r));
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		area a=new area();
		a.rectangle(scan.nextInt(),scan.nextInt());
		a.circle(scan.nextInt());
		a.square(scan.nextInt());
		a.area_circle();
		a.area_rectangle();
		a.area_square();
		scan.close();
		
		

	}

}
