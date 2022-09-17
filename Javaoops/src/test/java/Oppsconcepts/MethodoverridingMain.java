package Oppsconcepts;

public class MethodoverridingMain extends MethodOverriding {
	
	public void display()
	{
		super.display();
		System.out.println("Child Class called - Method overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodoverridingMain obj = new MethodoverridingMain();
		obj.display();
		
	}

}
