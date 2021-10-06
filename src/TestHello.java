
public class TestHello 
{
	
	public void race()
	{
		System.out.println("Increase Race");
		System.out.println("Increase accelator");
		
	}
	
	public void breaks()
	{
		System.out.println("Take brake");
		System.out.println("Take hand break");
	}
	
	public static void main(String[] args) {
		
		TestHello t=new TestHello();
		t.breaks();
		t.race();
	}
}
