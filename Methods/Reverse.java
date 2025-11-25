/*11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.*/

class NumberReverse{
     int reverse(int num){
      /*int a=num;
        int count=0;
        int digit=1;
        int rev=0;
        while(a>0){
         count++;
         a=a/10;
        }

        while(count>1){
          digit=digit*10;
          count--; 
        }

        while(num>0){
          int rem=num%10;
          rev=rev+(rem*digit);
          num/=10;
          digit/=10;
        }
        return rev;*/


       int result=0;
       while(num>0){
         int rem=num%10;
         result=(result*10)+rem;
         num/=10;
       }
       return result;
     }
}

class Reverse{
     public static void main(String []args){
     NumberReverse n=new NumberReverse(); 
     System.out.println(n.reverse(12345));
     }
}