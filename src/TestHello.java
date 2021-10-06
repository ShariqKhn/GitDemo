
public class TestHello 
{
	
	public void race()
	{
		System.out.println("Increase Race");
		
	}
	
	public void breaks()
	{
		System.out.println("Take brake");
	}
	
	public static void main(String[] args) {
		
		TestHello t=new TestHello();
		t.breaks();
		t.race();
	}
}
