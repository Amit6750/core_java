package TwoDi;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr=new int [7][5];
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr[i][j]=i+j;
				
			}
		}
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
		
		System.out.println();
		}
	}

}
