/*Q1. WAP to create class name as Table with functions 
 void setValue():  this function is used for accept the number as input parameter 
 void showTable(): this function can display the table of numbers.
===========================================================*/

class Table{
     int num;
     void setValue(int num){
         this.num=num; 
     }

     void table(){
         for(int i=1;i<=10;i++){
            System.out.println(num*i);
         }
     }

     public static void main(String [] args){
     Table t=new Table();
     t.setValue(5);
     t.table();
     }
}