package TwoDi;

public class TwoD5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr=new int [3][3];
		int sum=0;
		int num=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=num;
				num++;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			if(i==j)
				
			{
				sum=sum+arr[i][j];
				System.out.print(arr[i][j]);
			}
			else
			{
				System.out.print("  ");
			}
			}
			System.out.println();
	}
	System.out.println("sum :"+sum);
	}
}

	


