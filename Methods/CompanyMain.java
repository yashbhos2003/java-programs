//MINI PROJECT
import java.util.Scanner;
interface CompanyRules{
    //void addEmployee();
    void displayEmployee();
    double calculateSalary(Employee i);
    void searchEmployee(int id);
    void updateEmpName(int id,String name);
    void deptWiseEmpCount();
    void deleteEmployee(int id); 
    //void updatePerformance();
   // void promoteEmployee();
    
}

class Employee{
      private int empId;
      private String empName;
      private int baseSalary;
      private  Department dept;
      private int rating;
      //private double totalSalary;

      public void setEmpId(int empId){
            this.empId=empId;
      }
      public int getEmpId(){
            return empId;
      }
      
      public void setEmpName(String empName){
            this.empName=empName;
      }
      public String getEmpName(){
            return empName; 
      }

      public void setBaseSalary(int baseSalary){
            this.baseSalary=baseSalary;
      }
      public int getBaseSalary(){
            return baseSalary;
      }

      public void setRating(int rating){
            this.rating=rating;
      }
      public int getRating(){
             return rating;
      }

      /*public void setTotalSalary(double totalSalary){
            this.totalSalary=totalSalary;
      }
      public double getTotalSalary(){
            return totalSalary;
      }*/

      public void setDept(Department dept){
            this.dept=dept;
      }
      public Department getDept(){
            return dept; 
      }

}

class Department{
     private int deptId;
     private String deptName;

     Department(int deptId,String deptName){
                this.deptId=deptId;
                this.deptName=deptName;
     }

     public int getDeptId(){
           return deptId;
     }

     public String getDeptName(){
           return deptName;
     }
}

class Company implements CompanyRules{
     Employee e[];
     Company(Employee e[]){
        this.e=e;
     } 
     
     public void displayEmployee(){
           for(int i=0;i<e.length;i++){
              if(e[i]!=null){
              Department d=e[i].getDept();
              
              System.out.println(e[i].getEmpId()+" "+e[i].getEmpName()+" "+e[i].getBaseSalary()+" "+d.getDeptId()+" "+d.getDeptName()+" "+e[i].getRating()+" "+ /*                 e[i].getTotalSalary()*/calculateSalary(e[i]));
              }
           }
     }

     
     public double calculateSalary(Employee i){
           final double hra=0.2;
           final double da=0.1;
           double totalSal=i.getBaseSalary()+(hra*i.getBaseSalary())+(da*i.getBaseSalary());   
           return totalSal;  
     } 

     public void searchEmployee(int id){
           boolean flag=false;
           for(int i=0;i<e.length;i++){               
               if(e[i].getEmpId()==id){
                 System.out.println(e[i].getEmpId()+" "+e[i].getEmpName());
                 flag=true;
                 break;
               }   
           }
           if(!flag)
             System.out.println("Employee not found");
     }

     public void updateEmpName(int id,String name){
          boolean flag=false;
          for(int i=0;i<e.length;i++){
              if(e[i].getEmpId()==id){
                e[i].setEmpName(name);
                flag=true;
              }
          }
          System.out.println((flag)?"EmpName updated !":"No employee data found");
     }

     public void deptWiseEmpCount(){
          Department d;
          int dept=4,val=1;

          for(int i=0;i<e.length;i++){
              int count=0;
              
              for(int j=0;j<e.length;j++){
                 d=e[j].getDept();
                 if(d.getDeptId()==val){
                    count++;
                 }
              }
              d=e[i].getDept();
              if(val<=4){
                System.out.println("Department"+val+": "+d.getDeptName()+": "+count);
                val++;
              }
          }
     } 

     public void deleteEmployee(int id){
           for(int i=0;i<e.length;i++){
              if(e[i].getEmpId()==id){
                 e[i]=null;
                 break;
              }
           }
     }
     
}

class CompanyMain{
     public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          Employee e[]=new Employee[2];
          
          for(int i=0;i<e.length;i++){
             e[i]=new Employee();
             System.out.println("Enter details of Employee:empId,empName,baseSalary,Departent,rating");
             int empId=sc.nextInt();
             String EmpName=sc.next();
             int baseSalary=sc.nextInt();
             System.out.println("enter deptid,deptName");
             int deptId=sc.nextInt();
             String deptName=sc.next(); 
             Department d=new Department(deptId,deptName);            
             
             int rating=sc.nextInt();
             //double totalSalary=sc.nextDouble();

             e[i].setEmpId(empId);
             e[i].setEmpName(EmpName);
             e[i].setBaseSalary(baseSalary);
             e[i].setDept(d);
             e[i].setRating(rating);
             //e[i].setTotalSalary(totalSalary);
          }

          Company c=new Company(e);
          c.displayEmployee();
          /*System.out.println("enter id to Search employee");
          int id=sc.nextInt();
          c.searchEmployee(id);
          System.out.println("enter id and Updated name to update ");
          
                 id=sc.nextInt();
          String name=sc.next();
          c.updateEmpName(id,name);
          c.displayEmployee();

          c.deptWiseEmpCount();*/
          System.out.println("enter id to delete employee");
          int id=sc.nextInt();
          c.deleteEmployee(id);
          c.displayEmployee();
     }
}