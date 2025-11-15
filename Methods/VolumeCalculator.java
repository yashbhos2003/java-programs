/*Q4. Write a Java class VolumeCalculator with overloaded methods named volume() to calculate:
volume of a cube (using side),
volume of a cuboid (using length, breadth, height),
volume of a cylinder (using radius, height).
Hint: Apply formulas :
Cube → side³
Cuboid → l×b×h
Cylinder → 3.14×r×r×h


*/
import java.util.Scanner;
class VolumeCalculator{
         static void volume(int side){
             int cube=side*side*side;
             System.out.println(cube);
         }
         static void volume(int l,int b,int h){
             int cuboid=l*b*h;
             System.out.println(cuboid);
         }
         static void volume(int r ,int h){
             double cylinder=3.14*r*r*h;
             System.out.println(cylinder);
         } 
     public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter side for volume of cube");
           int side=sc.nextInt();
           volume(side);
           System.out.println("enter length,breadth height for volume of cuboid");
           int l=sc.nextInt();
           int b=sc.nextInt();
           int h=sc.nextInt();
           volume(l,b,h);
           System.out.println("enter radius,height for volume of cylinder");
           int r=sc.nextInt();
           int he=sc.nextInt();
           volume(r,he);	
     }
}