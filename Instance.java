package first;

public class Instance {

	public static void main(String[] args) {

		
		Car animal=new Car();
				animal.run();
				animal.eat();
	}

}

class Car
{
	String name = "swift";
	public void run()
	{
		System.out.println("runing");
		System.out.println(name);
	}
	public void eat()
	{
		System.out.println("eating");
		System.out.println(name);
	}
}