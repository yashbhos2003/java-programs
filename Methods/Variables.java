class Variables{
    private int id;
    private String name;
    private int salary;

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
   
    public int getSalary(){
        return salary;
    }
}

class Employee{
     Variables v;

   void addNewEmploye(Variables v){
       this.v=v;
   }  

   void printData(){
       System.out.println(v.getId());
       System.out.println(v.getName());
       System.out.println(v.getSalary());
  } 
    
}

class Main{
     public static void main(String []args){
          Variables v=new Variables();
            v.setId(1);
            v.setName("Yash");
            v.setSalary(50000);
          Variables v1=new Variables();
            v1.setId(2);
            v1.setName("Amit");
            v1.setSalary(50000);
         Employee e=new Employee();
         e.addNewEmploye(v);
         e.printData();
         e.addNewEmploye(v1);
         e.printData();
     }
}
