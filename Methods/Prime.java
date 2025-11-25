/*14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.*/

class PrimeChecker{
     void isPrime(int num){
          Boolean flag=true;
         for(int i=2;i<=num/2;i++){
            if(num%i==0){
            flag=false;
            }
         }
         if(flag){
           System.out.println(num+" is prime");
         }else{
           System.out.println(num+" is not prime");

         }
     } 
}

class Prime{
    public static void main(String [] args){
          PrimeChecker p=new PrimeChecker();
          p.isPrime(11);
          
    }
}