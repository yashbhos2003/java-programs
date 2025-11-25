import java.util.*;
class Employee{
    private int id;
    private String name;
    private int salary;

    public void setId(int id){
         this.id=id;
    }

    public int getId(){
          return id;
    } 

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
         return name;
    }

    public void setSalary(int salary){
         this.salary=salary;
    }

   public int getSalary(){
          return salary;
   }
}

class ObjectsArray{
     public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     Employee emp[]=new Employee[5];
     for(int i=0;i<emp.length;i++){
        
        emp[i]=new Employee();
        System.out.println("Enter values");
        String name=sc.next();
        int id=sc.nextInt();
        int salary=sc.nextInt();
        emp[i].setName(name);
        emp[i].setId(id);
        emp[i].setSalary(salary);       
     }

     System.out.println("Dispaly data");
     for(int i=0;i<emp.length;i++){
        System.out.println(emp[i].getId()+"   "+emp[i].getName()+"  "+emp[i].getSalary()); 
     }
     }
}