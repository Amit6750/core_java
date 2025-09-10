package String;

public class charat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("welcome");
		for( int i=0;i<str.length();i++)
			
		{
			//System.out.println(str.charAt(i)== 'e');
			if(str.charAt(i)=='e' || str.charAt(i)=='o')
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				System.out.print(i);
			}
		}
	}

}
