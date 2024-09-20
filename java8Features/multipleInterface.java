package java8Features;



interface Tusta{
	public void m1();}
                                           
class demo implements Tusta{                  // Example that abatruct method can"t be implemented by main method class
	public void m1(){
		System.out.println("hello");
	}
	
}
	

public class multipleInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Tusta t=new demo();
       t.m1();
	}

}
