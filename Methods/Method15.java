/*Q2. Q3. Write a program with a class MaxFinder having overloaded max() methods that return the largest value among:
two integers,
three integers, and
two double values.

*/

class Method15{
         static int max(int a,int b){
             if(a>b)
               return a;
             else
               return b;
         }
         static int max(int a,int b,int c){
             if(a>b && a>c)
               return a;
             else if(b>a && b>c)
               return b;
             else
               return c;
         }
         static double max(double a,double b){
            if(a>b)
               return a;
             else
               return b;
         } 
     public static void main(String args[]){
           System.out.println(max(3,4));
           System.out.println(max(3,4,5));
	   System.out.println(max(3.0,4.0));	
     }
}