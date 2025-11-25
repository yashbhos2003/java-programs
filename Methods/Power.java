/*13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.*/


class PowerCalculator{
      int power(int base,int expo){
          int result=1;
          while(expo>0){
             result=result*base;
             expo--;
          }
       return result;
      }
}

class Power{
     public static void main(String []args){
     PowerCalculator p=new PowerCalculator();
     System.out.println(p.power(3,3));
     }
}