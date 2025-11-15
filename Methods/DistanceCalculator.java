/*Q5. Write a Java program with class DistanceCalculator that contains overloaded distance() methods to calculate:
distance = speed × time (integer type),
distance = initial velocity × time + 0.5 × acceleration × time² (double type).
*/
import java.util.Scanner;
class DistanceCalculator{
         static void distance(int s,int t){
             int d=s*t;
             System.out.println(d);
         }
         static void distance(double v,double t,double a){
             double d=(v*t)+(0.5*a*t*t);
             System.out.println(d);
         }
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter speed and time for calculate distance");
         int speed=sc.nextInt();
         int time=sc.nextInt();
         distance(speed,time);
         
         System.out.println("enter velocity time and acceleration for calculate distance");
         int velocity=sc.nextInt();
         int t=sc.nextInt();
         int acceleration=sc.nextInt();
         distance(velocity,t,acceleration);
     }
}