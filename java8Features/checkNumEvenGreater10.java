package java8Features;
import java.util.function.Predicate;




public class checkNumEvenGreater10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Predicate<Integer> r=i->i%2==0;
     Predicate<Integer> s=i->i>10;
     Predicate<Integer>u=r.negate(); //jar opposite chai, tar obj with (.) negate() use korte hbe. complement ans debe.
     int [] arr={2,6,30,21,23,};
     for(Integer i: arr){
    	 if(u.test(i)){
    		 System.out.print(" "+i+",");
    		
    	 
    	 
    	 }	 
     }
	}
	
}
