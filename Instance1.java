package first;

public class Instance1 {

	public static void main(String[] args) {

         Notebook notebook=new Notebook();
         notebook.write();
         notebook.read();
	}

}

class Notebook
{
	String name="java";
	public void write()
	{
	System.out.println("writeing");	
	System.out.println(name);
	}
	public void read()
	{
		System.out.println("reading");
		System.out.println(name);
	}

}
