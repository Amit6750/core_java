package first;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] arr=new int[100];
				for (int i=0;i<100;i++)
				{
					arr[i]=i+1;
				}
				int sum=0;
				for(int i=0;i<100;i++)
				{
					if(arr[i]%33==0)
					{
				sum = sum+arr[i];
					
				}
	}
				System.out.println(sum);
	}

}
