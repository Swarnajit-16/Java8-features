package java8Features;

interface Swarna{
	default void m1(){
		System.out.println("hello!!!!");
	}
}

public class defaultMethod implements Swarna{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Swarna s= new defaultMethod();
      s.m1();
	}

}

