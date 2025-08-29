package first;

public class Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr=new int [10];
    
    arr[0]=12;
    arr[1]=23;
    arr[2]=34;
    arr[3]=21;
    arr[4]=54;
    arr[5]=43;
    arr[6]=65;
    arr[7]=76;
    arr[8]=83;
    arr[9]=92;
    
    int sum=0;
    for(int i=0;i<10;i++)
    {
    	if(arr[i]%2==0)
    	{
    		sum=sum+arr[i];
    	}
    }
    System.out.println(sum);
    
	}

}
