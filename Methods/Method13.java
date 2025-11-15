/*Q1. Write a Java program to create a class AreaCalculator that uses function overloading to calculate the area of:
a circle using radius,
a rectangle using length and breadth, and
a triangle using base and height.
Use methods:
void area(int r)
void area(int l, int b)
void area(double b, double h)
*/

class Method13{
        void area(int r){
           double area=3.14*r*r; 
           System.out.println(area);
        }
        void area(int l,int b){
           int area=l*b;
           System.out.println(area);
        }
        void area(double b, double h){
           double area=0.5*b*h;
           System.out.println(area);
        }
     public static void main(String args[]){
       Method13 m=new Method13();
       m.area(5);
       m.area(10,10);
       m.area(5.0,5.0);
     }


}