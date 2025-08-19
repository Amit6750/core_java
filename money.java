package first;

public class money {

	public static void main(String[] args) {
		int money=3000;
		if(money>=1000 && money<2000)
		{
			System.out.println("first installment");
		}
		else if(money>=2000 && money<3000)
		{
			System.out.println("second installment");
			
		}
		else if(money>=3000 && money<4000)
		{
			System.out.println("thired installment");
			
		}
		else
		{
			System.out.println("total");
		}
	}

}
