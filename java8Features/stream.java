package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    List<Integer> list1=new ArrayList<>();
    list1.add(12);
    list1.add(13);
    list1.add(14);
    list1.add(15);
    list1.add(18);
    System.out.println(list1);
    
    
    List<Integer> list2=new ArrayList<>();
    for(int a:list1){
    	if(a>14){
    		list2.add(a);
    	}
  }
    
	Stream<Integer>stream=list1.stream();
	List<Integer> newStream = stream.filter(i->i%2==0).collect(Collectors.toList());
	
    System.out.println(list2);
	System.out.println(newStream);
	}

}
