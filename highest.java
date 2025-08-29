package first;

public class highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr=new int[5];
		arr[0]=12;
		arr[1]=16;
		arr[2]=82;
		arr[3]=22;
		arr[4]=32;
	
		int highest=0;
		
		for(int i=0;i<5;i++)
		{
			if(arr[i]>highest)
			{
				highest=arr[i];
			}
		}
		System.out.println(highest);
	}

}
