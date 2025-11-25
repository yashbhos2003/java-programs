/*19. Find GCD of Two Numbers
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Introduces loops and mathematical relationships.*/

class GCDCalculator{
    int findGCD(int a,int b){
       
       while(a!=b){
          if(a>b){
            a=a-b;
          }else{
            b=b-a;
          }
       }
       return a;
    }
}

class Leap{
     String leapYear(int year){
       if((year%400==0) || (year%4==0 && year%100!=0)){
         return year+" is leap";
       }else{
         return year+" is leap";

       }
     }

}
class GCD{
    public static void main(String[]args){
    GCDCalculator g=new GCDCalculator();
    Leap l=new Leap();
    System.out.println(g.findGCD(54,24));  
    System.out.println(l.leapYear(2016));
    }
}