package java8FeaturesAdditionalPFI;
import java.util.function.*;
public class IntPredicateExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     IntPredicate h=i->i%2==0;
     int[] arr={2,4,5,7,8};
     for(int a:arr){
    	 if(h.test(a)){
    		 System.out.println(a+"->"+h.test(a));
    		
    	 }
     }
     
	}

}
