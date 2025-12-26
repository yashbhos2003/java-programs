/*Q1. Employee Salary System
Concepts Used: Abstract class, method overriding, logic
 Operations to Perform:
Create an abstract class Employee
Fields: empId, name, basicSalary
Abstract method: calculateSalary()
Create two subclasses:
PermanentEmployee (HRA 20%, DA 10%)
ContractEmployee (HRA 10%, DA 5%)
Calculate total salary
Display employee details
Logic Focus:
 Different salary calculation logic using inheritance.
📌 Explanation:
 Abstract class forces subclasses to implement salary logic differently.*/


abstract class Employee{
       int empId;
       String name;
       int basicSalary;
       
       Employee(int empId,String name,int basicSalary){
              this.empId=empId;
              this.name=name;
              this.basicSalary=basicSalary;
       }
     abstract double calculateSalary();      
}

class PermanentEmployee extends Employee{

      PermanentEmployee(int empId,String name,int basicSalary){
           super(empId,name,basicSalary);   
      }
      double calculateSalary(){
          int hra=20,da=10;
          double totalSal=basicSalary+(basicSalary*(hra/100.0))+(basicSalary*(da/(100.0)));
          return totalSal;
      } 
}

class ContractEmployee extends Employee{
     ContractEmployee(int empId,String name,int basicSalary){
           super(empId,name,basicSalary);
     }
     double calculateSalary(){
          int hra=10,da=5;
          double totalSal=basicSalary+(basicSalary*(hra/100.0))+(basicSalary*(da/(100.0)));
          return totalSal;
      }   
}

class EmpSal{
     public static void main(String [] args){
          Employee e1=new PermanentEmployee(1,"Yash",20000);
          System.out.println(e1.empId+" "+e1.name+" "+e1.basicSalary+" "+e1.calculateSalary()); 
          Employee e2=new ContractEmployee(2,"Amit",20000);
          System.out.println(e2.empId+" "+e2.name+" "+e2.basicSalary+" "+e2.calculateSalary()); 
     }
}