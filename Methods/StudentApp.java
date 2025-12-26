/*Q23. WAP to create POJO class name as Student with field name, id and per and we have class
name as Dept with two methods
void setStudent(Student student): this method is used for accept student as parameter
void showStudent(): this method is used for show the student details.*/

class Student{
      String name;
      int id;
      int per;

      void setName(String name){
          this.name=name;
      }
      String getName(){
          return name;
      }
      void setId(int id){
          this.id=id;
      }
      int getId(){
          return id;
      }
      void setPer(int per){
          this.per=per;
      }
      int getPer(){
          return per; 
      }
}

class Dept{
      Student s;
    void setStudent(Student s){
       this.s=s;
    }

    void showStudent(){
       System.out.println(s.getId());
      System.out.println(s.getName());    
      System.out.println(s.getPer());
    }
}

class StudentApp{
     public static void main(String []args){
     Student s= new Student();
     s.setName("Yash");
     s.setId(1);
     s.setPer(90);

     Dept d=new Dept();
     d.setStudent(s);
     d.showStudent();
     }
}
