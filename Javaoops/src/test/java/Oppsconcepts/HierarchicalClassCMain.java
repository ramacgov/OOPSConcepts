package Oppsconcepts;

public class HierarchicalClassCMain extends HierarchalInheritance {
	
	int c=50;
	
	void displayC()
	{
		System.out.println("Derived Class C" + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchicalClassCMain obj = new HierarchicalClassCMain();
		obj.displayC();
		obj.displayA();
		HerarchicalclassB obj1 = new HerarchicalclassB();
		obj1.displayB();
		obj1.displayA();
		
	}

}
