package Oppsconcepts;

public class ParamConstructor {
	
	int id;
	float mark;
	String name;
	
	ParamConstructor(int A, float B,String C)
	
	{
		id = A;
		mark = B;
		name = C;
					
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+mark);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParamConstructor Obj = new ParamConstructor(10,90,"Ram");
		Obj.display();
				
	}

}
