/*Q1. Create a class Compare that extends a base class Value and overrides getResult() to return the greater of the two numbers.
Create another class Check that accepts only a Compare object and displays the result.
Demonstrate tight coupling by passing only Compare object to Check.*/


class Value{
     int num1;
     int num2;

     Value(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
     }

     int getResult(){
        if(num1>num2){
          return num1;
        }
         return num2;
     }
}

class Compare extends Value{
      Compare(int num1,int num2){
         super(num1,num2);
      }

      int getResult(){
        if(num1>num2){
          return num1;
        }
         return num2;
     }
}

class Display{
     Compare c;
     Display(Compare c){
        this.c=c;
     }

     void print(){
        System.out.println(c.getResult());
     }
}

class CompareMain{
     public static void main(String []args){
        Compare c=new Compare(10,20);
        Display d=new Display(c);
        d.print();
     }
}
