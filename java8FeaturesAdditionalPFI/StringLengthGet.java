package java8FeaturesAdditionalPFI;

import java.util.function.ToIntFunction;

public class StringLengthGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ToIntFunction<String>g=s->s.length();
        String [] st={"swarna","rohit","subhas","ranajit"};
        for(String ss:st){
        	System.out.println(g.applyAsInt(ss));	
        }
        
        
	}

}
