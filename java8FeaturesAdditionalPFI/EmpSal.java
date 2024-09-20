package java8FeaturesAdditionalPFI;

import java.util.ArrayList;
import java.util.function.ToDoubleFunction;
import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.RequestingUserName;

import java8Features.emp;
import java8Features.lengthArrayString;
import java8Features.salaryIncrement;

class Emp{
	double salary;
	 String name;
	@Override
	public String toString() {
		return " [salary=" + salary + " name=" + name + "]";
	}
	Emp(double salary,String name){
		this.salary=salary;
		this.name=name;
	}
}
public class EmpSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Emp>g=new ArrayList<Emp>();
	     g.add(new Emp(10000.0,"Sujesh"));
	     g.add(new Emp(30000.0,"Monoj"));
	     g.add(new Emp(20000.0,"mahesh"));
	     g.add(new Emp(50000.0,"debesh"));
	   
     ToDoubleFunction<String> l= st->{
    	 
		for(Emp s:g){
    		 if(s.name != null){
    			 return s.salary;
    		 }
    	 }
		return 0;
    	 
    
    		 
    	 };
//    	 for(String t:Emp.name)
//    	 {
//    		 System.out.println("salary="+l.applyAsDouble(t));
//    	 }
    	 String ename="debesh";
    	 Double salary=l.applyAsDouble(ename);
    	 System.out.println(ename+"->"+salary);
     }
	}


