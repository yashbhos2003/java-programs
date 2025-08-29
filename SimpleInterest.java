import java.util.Scanner;
class SimpleInterest {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter principle Amount:");
      int principle =sc.nextInt();
    System.out.println("Enter time:");
      int time =sc.nextInt();
    System.out.println("Enter units:");
      double rate =sc.nextDouble();
    double si=(principle*time*rate)/100;
      //si=principle+si;
    System.out.println(si);         	
    }
}