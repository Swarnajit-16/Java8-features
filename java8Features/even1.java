package java8Features;
import java.util.function.*;

interface pre<T>{
	public boolean test(T i);
}
public class even1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     pre<Integer>u=l->l%2==0; //l holo implementd class er variable . main theke class kore je value pathabo seta l e dukhbe. ami ja icha likhte pari ota.
     
    	int [] arr={2,5,6,3,4};
    	for(Integer k:arr){
    		if(u.test(k)){
    			System.out.println(k);
    		}
    	}
  
	}

}
