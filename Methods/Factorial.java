/*12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.*/

class FactCalculator{
     static void findFactorial(int num){
             int fact=1;
          for(int i=num;num>0;num--){
             fact*=num;
          }
          System.out.println(fact);
     } 
}

class Factorial{
    public static void main(String []args){
       FactCalculator.findFactorial(3);
        FactCalculator.findFactorial(4);
    }
}