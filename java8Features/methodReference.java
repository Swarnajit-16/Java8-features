package java8Features;

interface k{
	public void m2();
}
class t{
public static void m1(){
	System.out.println("hello swarnajit");
}
}
class q{
public void m1(){
	System.out.println("hello sneha");
}
}

public class methodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    k r=t::m1;   //interface variable r er modhay t class er m1() ke reffer korchi. 
    r.m2();       //then oi variable dia interface method m2() call korchi
    
    q w=new q();    //jehetu q class er method non static, obj w banate holo.
    k a=w::m1;      //interface variable a er modhay q class er banano obj w dia m1() ke reffer korchi.
    a.m2();           //then oi variable dia interface method m2() call korchi
    
    System.out.println("hi hello");
	}

}
