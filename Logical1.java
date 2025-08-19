package first;

public class Logical1 
{
	public static void main(String[] args) {

       Book book=new Book();
        book.write();
        book.read();
	}

}

class Book
{
	
	public void write()
	{
	String name="java";
	System.out.println("writeing");	
	System.out.println(name);
	}
	public void read()
	{
		String name="python";
		System.out.println("reading");
		System.out.println(name);
	}

}
