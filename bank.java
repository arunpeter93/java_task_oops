package oops;

abstract class bank {
abstract int rateofinterest();
}
class sbi extends bank
{
	int rateofinterest() {return 9;}
}
class axis extends bank
{
	int rateofinterest() {return 10;}
}
class testabstract
{
	public static void main(String[] args) {
		bank b=new sbi();
		bank b1=new axis();
		System.out.println("ROI: "+b.rateofinterest());
		System.out.println("ROI: "+b1.rateofinterest());

	}

}
