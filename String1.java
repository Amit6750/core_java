package String;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calc calc=new calc();
				calc.addition(10,10);
				
				calc.sub(20,10);
				
				calc.mult(12, 20);
				
				calc.div(4.0f, 3.0f);
	}

}

class calc
{
	public void addition(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	public void sub (int n1,int n2)
	{
		System.out.println(n1-n2);
	}
	
	public void mult(double n1,double n2)
	{
		System.out.println(n1*n2);
	}
	public void div(float n1,float n2)
	{
		System.out.println(n1/n2);
	}
	
}