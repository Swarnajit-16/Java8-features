package java8Features;

import java.util.ArrayList;

//import java.util.function.BiFunction;

interface BiFunction<Integer,String,Employee> {
	public Employee apply(Integer t,String s);
}
class info implements BiFunction<Integer,String,Employee11>{
	public Employee11 apply(Integer eno,String name){
		return new Employee11(eno,name);
		
	}
}
//(eno,name)->new Employee11(eno,name);
class Employee11{
	int eno;
	String name;
	Employee11(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
//	@Override
//	public String toString() {
//		return " [eno=" + eno + ", name=" + name + "]";
//	}
}

public class biFunctionShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BiFunction<Integer,String,Employee11>g=(eno,name)->new Employee11(eno,name);
		BiFunction<Integer,String,Employee11>g=new info();
     ArrayList<Employee11>l=new ArrayList<Employee11>();
     l.add(g.apply(100, "Swarna"));
     l.add(g.apply(200, "Sujata"));
     l.add(g.apply(400, "Sneha"));
     l.add(g.apply(300, "Sujesh"));
     l.add(g.apply(600, "Sudhir"));
     System.out.println(l);
     for(Employee11 el:l){
    	 System.out.println(el.eno+":"+el.name);
     }
	}

}
