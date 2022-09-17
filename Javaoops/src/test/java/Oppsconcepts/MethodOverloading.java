package Oppsconcepts;

public class MethodOverloading {
	
	int c;
	
	public void add()
	{
		System.out.println("addition");
	}
	
	public void add(int a,int b)
	{
		c = a+b;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading ob = new MethodOverloading();
		ob.add(1, 2);
		ob.add();
		
	
	}

}
