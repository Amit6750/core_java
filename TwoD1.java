package TwoDi;

public class TwoD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr=new int [10][10];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				arr[i][j]=i+j;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(arr[i][j]+"     ");
			}
			System.out.println();
		}
		
		
	}

}
