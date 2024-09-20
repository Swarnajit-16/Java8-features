package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String>list=new ArrayList<>();
      list.add("Swarna");
      list.add("durgesh");
      list.add("suvas");
      System.out.println(list);
      
      Stream<String>stream=list.stream();
      Stream<String>stream1=list.stream();
      List<String>newList=stream.filter(e->e.startsWith("d")).collect(Collectors.toList());
      List<String>newList1=stream1.filter(e->e.length()==6).collect(Collectors.toList());
      System.out.println(newList);
      System.out.println(newList1);
	}

}
