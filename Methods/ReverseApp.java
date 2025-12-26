/*Q12. WAP to create class name as Rev with two functions 
void setValue(int …x): this function can accept infinite values from calling 
void rev(): this function can reverse the array and display it

*/

class Reverse{
     int x[];
     void setValue(int ...x){
        this.x=x; 
     }

     void rev(){
       for(int i=0;i<x.length/2;i++){
          int temp=x[i];
          x[i]=x[x.length-i-1];
          x[x.length-i-1]=temp;
       }

       for(int i=0;i<x.length;i++){
          System.out.print(x[i]+" ");
       }
     }   
}

class ReverseApp{
      public static void main(String [] args){
      Reverse r=new Reverse();
      r.setValue(1,2,3,4,5,6); 
      r.rev(); 
      }
}