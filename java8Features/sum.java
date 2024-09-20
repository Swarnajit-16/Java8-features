package java8Features;

interface C{
	public void View(int a,int b);
}
// class demo implements C{
//	public void View(int a,int b){
//		System.out.println(a+b);
//	}
//}


public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      C s=( a, b)->System.out.println(a+b);
      s.View(7,9);
	}
//	public static void add(int a, int b) {
//	  	int c=a+b;
//	  	System.out.println(c);
//	}


}
