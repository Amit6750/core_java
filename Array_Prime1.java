package first;

public class Array_Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=13;
		boolean flag=false;
		
		for(int i=0;i<13;i++)
		{
			if(num%2==0)
			{
				boolean flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println("composite");
		}
		else
		{
			System.out.println("prime");
		}
	}

}
