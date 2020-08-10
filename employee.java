package oops;

public class employee {
	int id=100,salary=40000;
	String name="Arun";
}
class department extends employee{
	String dept="Testing",Desg="Jr.tester";

	public static void main(String[] args) {
		department d=new department();
		System.out.println("employee details:"+d.dept+" "+d.Desg+" "+d.id+" "+d.salary+" "+d.name);

	}

}
