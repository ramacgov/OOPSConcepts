package Oppsconcepts;

public class Constructor {
	
	int A;
	float B;
	
	Constructor()
	{
		
		System.out.println("Object Initialised");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor Obj = new Constructor();
		System.out.println(Obj.A);
		System.out.println(Obj.B);
		
	}

}
