package assignmentprograms;

public class Polymorphism_Compiletime 
{
	static void payment(int cardno)
	{
		System.out.println("Payment of 20K done through debit card number ending with: "+cardno);
	}
	static void payment(String netbanking)
	{
		System.out.println("Payment of 20K done through sbi netbanking with user name: "+netbanking);
	}
	void payment()
	{
		System.out.println("Payment of 20K done through Cash");
	}
	public static void main(String[] args) 
	{
		System.out.println("Payments made through different channels");
		Polymorphism_Compiletime p1=new Polymorphism_Compiletime();
		p1.payment();
		payment(3456);
		payment("rama.mamidi");
	}

}
