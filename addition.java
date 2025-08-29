package first;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[5];
		arr[0]=5;
		arr[1]=8;
		arr[2]=26;
		arr[3]=42;
		arr[4]=12;
		
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
