package Oppsconcepts;

public class Interfacemain implements InterfaceCalc,Interfacetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interfacemain obj1= new Interfacemain();
		obj1.add();
		obj1.multiply();
		obj1.disp();
		obj1.test();
	}

	public void add() {
		// TODO Auto-generated method stub
		
		//int c;
		//c=a+b;
		System.out.println("Addition");
		
	}

	public void multiply() {
		// TODO Auto-generated method stub
		
		//int d;
		//d=a*b;
		System.out.println("Multiply");
		
	}

	public void test() {
		// TODO Auto-generated method stub
		
		System.out.println("test");
		
	}

	public void disp() {
		// TODO Auto-generated method stub
		
		System.out.println("disp");
		
	}

	
}
