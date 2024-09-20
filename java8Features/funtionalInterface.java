package java8Features;

interface A{
	public void m1();
	
}
class test implements A{
	public void m1(){
		System.out.println("Wellcome! Swarnajit");
	}
}

public class funtionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     test t= new test();
//     t.m1();
		A a=new test();            //parent reference uses to hold child obj
		a.m1();
	}

}
