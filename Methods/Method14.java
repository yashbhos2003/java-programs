/*Q2. Create a class Adder that contains overloaded methods named sum() to calculate:
sum of two integers,
sum of three integers, and
sum of two double values.
*/

class Method14{
         static void sum(int a,int b){
             int sum=a+b;
             System.out.println(sum);
         }
         static void sum(int a,int b,int c){
             int sum=a+b+c;
             System.out.println(sum);
         }
         static void sum(double a,double b){
            double sum=a+b;
             System.out.println(sum);
         } 
         public static void main(String args[]){
           sum(3,4);
           sum(3,4,5);
	   sum(3.0,4.0);	
     }
}