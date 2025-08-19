package first;

public class Static {

	public static void main(String[] args) {

		beach amit=new beach();
		amit.name="kokan";
		
		beach sahil=new beach();
		sahil.name="goa";
		
		
		System.out.println(amit.name);
		System.out.println(sahil.name);
		//System.out.println(beach.name);
	}

}

class beach
{
	static String name="kerala";
}