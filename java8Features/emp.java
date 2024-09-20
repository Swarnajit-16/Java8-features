package java8Features;

import java.util.*;
import java.util.function.*;

interface pr<Employee>{
	public boolean test(Employee e1);
}

class employee1 implements pr<Employee>{
	public boolean test(Employee e1){
		return e1.salary>300000;
		
	}
}

class Employee{
	String name;
	double salary;
	 Employee(String name, double salary){
		 this.name=name;
		 this.salary=salary;
		 
	 }
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}

public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Employee> l= new ArrayList<>();
     l.add(new Employee("jatin", 200000));
     l.add(new Employee("swarna", 400000));
     l.add(new Employee("surja", 300000));
     l.add(new Employee("moni", 500000));
     l.add(new Employee("jayanta", 700000));
     l.add(new Employee("sujoy", 600000));
     pr<Employee> f=new employee1();
     for(Employee e2:l){
    	 if(f.test(e2)){
    		 System.out.println(e2);
    		 
    	 }
     }
	}     //(Employee e1)->e1.salary>20000;
            //pr<Employee>f=e1->e1.salary>20000;
	          
}
