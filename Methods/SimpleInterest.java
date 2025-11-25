/*5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.*/

class SimpleInterest{
      void calculate(int p,int r,int t){
          double si=(p*r*t)/100;
          System.out.println(si);
      }
}

class Main{
     public static void main(String []args){
          SimpleInterest si=new SimpleInterest();
          si.calculate(100,10,2);
      }

}