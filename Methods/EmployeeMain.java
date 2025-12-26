/*1. Question:
 Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
The manager gets a 20% bonus on salary.
The developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.*/

class Employee{
     String name;
     int salary;

     Employee(String name,int salary){
          this.name=name;
          this.salary=salary;
     }

     void totalSal(){
         System.out.println(name+" "+salary);
     }
}

class Manager extends Employee{

     Manager(String name,int salary){
      super(name ,salary);
    
    }
     void totalSal(){
         double sal=salary*0.20;
         System.out.println(name+" "+(salary+sal));

    }
}

class Developer extends Employee{

     Developer(String name,int salary){
        super(name,salary);
     }
     void totalSal(){
         double sal=salary*0.10;
         System.out.println(name+" "+(salary+sal));

    }
}

class EmployeeMain{
     public static void main(String []args){
       
       Manager m=new Manager("yash",2000);
       m.totalSal();
       Developer d=new Developer("pranav",30000);
       d.totalSal();
     }
}