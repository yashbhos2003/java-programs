class Parent{
     void show(){
        System.out.println("in parent show");
     }
}

class Child extends Parent{
     void display(){
       System.out.println("in child dispaly");
     }
}

class ParentChild{
      public static void main(String [] args){
      Parent p=new Child();
      p.display();
      p.show();  
      }
}



//Parent cha refernce ne parent chya method call hotat child chya nahi
