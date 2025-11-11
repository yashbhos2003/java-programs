/*print Fibonacci series upto n*/

import java.util.*;
class Method6{
       void fibonacii(int range){
         int a=0,b=1;
         System.out.print(a +" "+b+" ");
         for(int i=2;i<range;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
         }
       }
     public static void main(String [] args){
     Scanner sc=new Scanner(System.in); 
     int n=sc.nextInt();
     Method6 m=new Method6();
     m.fibonacii(n); 
     }
}