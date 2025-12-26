/*Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da. Store details of 5 employees using an array of objects. Perform the following operations:
Calculate the gross salary for each employee (gross = basic + hra + da).
Find and display the employee with the maximum salary.
Print the details of employees whose salary is greater than the average salary of all employees.
Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.*/

import java.util.Scanner;
class Employee{
     private int empId;
     private String name;
     private int basicSalary;
     private int hra;
     private int da;

     void setEmpId(int empId){
         this.empId=empId;
     }
     int getEmpId(){
         return empId;
     }

     void setName(String name){
         this.name=name;
     }
     String getName(){
         return name;
     }
     void setBasicSalary(int basicSalary){
         this.basicSalary=basicSalary;
     }
     int getBasicSalary(){
         return basicSalary;
     }
     void setHra(int hra){
         this.hra=hra;
     }
     int getHra(){
         return hra;
     }
     void setDa(int da){
         this.da=da;
     }
     int getDa(){
         return da;
     }   
}

class AllEmployees{
     Employee e[];
     AllEmployees(Employee e[]){
       this.e=e;
     }

     void grossSal(){
         int maxSal=0;
         int sum=0;
         for(int i=0;i<e.length;i++){
            int gross=e[i].getBasicSalary()+e[i].getHra()+e[i].getDa();
            System.out.println("gross of employee"+i+" "+gross);
            sum=sum+gross;
            
            if(gross>maxSal){
              maxSal=gross;
            }
         }

          System.out.println("Max Salary of employee"+maxSal);
          double avg=(double)sum/e.length;
          System.out.println("Average Salary of employee"+avg); 

          for(int i=0;i<e.length;i++){
            int gross=e[i].getBasicSalary()+e[i].getHra()+e[i].getDa();
            if(gross>avg){
              System.out.println(e[i].getEmpId()+" "+e[i].getName()+" "+e[i].getBasicSalary()+" "+e[i].getHra()+" "+e[i].getDa());
            }
          }  
     }
     
}

class EmployeeApp{
      public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         Employee e[]=new Employee[3];

         for(int i=0;i<e.length;i++){
            e[i]=new Employee();
            System.out.println("enter values of  empId, name, basicSalary, hra, and da respectively"); 
                int empId=sc.nextInt();
                String name=sc.next();
                int basicSalary=sc.nextInt();
                int hra=sc.nextInt();
                int da=sc.nextInt();

                e[i].setEmpId(empId);
                e[i].setName(name);
                e[i].setBasicSalary(basicSalary);
                e[i].setHra(hra);
                e[i].setDa(da);
         }

       AllEmployees ae=new AllEmployees(e); 
       ae.grossSal();
      }
}