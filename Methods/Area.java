/*10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.*/

class CircleArea{
     double findArea(int r){
        double area=3.14*r*r;
        return area;
     }
}

public class Area{
   public static void main(String []args){
      CircleArea c=new CircleArea();
      System.out.println(c.findArea(5));  
  }
}