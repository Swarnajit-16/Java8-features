package java8Features;

interface B{
	public void m1();
	
}


public class functionalInterfaceImplementsLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a= ()->System.out.println("Wellcome! Swarnajit");            
		a.m1();
	}

}
