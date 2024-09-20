package java8FeaturesAdditionalPFI;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleFunction;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // ToDoubleFunction<Integer>g=i->Math.sqrt(i);
     IntToDoubleFunction g=i->Math.sqrt(i);
     int[] arr={14,169,196,144,156,256};
     for(int a:arr){
    	 System.out.println(g.applyAsDouble(a));
     }
     
	}

}
