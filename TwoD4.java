package TwoDi;

public class TwoD4 {

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
			if(arr[i][j]%2==0)
				
			{
				
				System.out.print("Ev"+" ");
			}
			else
			{
				System.out.print("od"+"  ");
			}
			}
			System.out.println();
	}
	//System.out.println("sum :"+sum);
	}
}

	



	


