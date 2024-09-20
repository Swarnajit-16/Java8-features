package java8Features;

import java.util.ArrayList;

interface BiConsumer<Employees,Double>{
	public void accept(Employees e,Double d);
}
class incre implements BiConsumer<Employe,Double>{
	public void accept(Employe emp, Double increment){
		emp.salary=emp.salary+increment;
		System.out.println(emp);
	}
}
class Employe{
	String name;
	Double salary;
	 Employe(String name,Double salary) {
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", salary=" + salary + "]";
	}
}

public class salaryIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Employe>f=new ArrayList<Employe>();
  
  BiConsumer<Employe,Double>g=new incre();
 f.add(new Employe("Swarna",2000.0) );
 f.add(new Employe("Saranna",3000.0) );
 f.add(new Employe("Sujit",4000.0) );
 f.add(new Employe("Suhana",5000.0) );
 
 for(Employe es:f){
	 g.accept(es,500.0);
 }
	}

}
