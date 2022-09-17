package Oppsconcepts;

public class MultipleInheritanceCMain extends MutiLevelInheritanceB{
	
int c=10;
	
	void dispC()
	{
		System.out.println("Base class C"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInheritanceCMain obj = new MultipleInheritanceCMain();
		obj.dispC();
		obj.dispB();
		obj.dispA();

	}

}
