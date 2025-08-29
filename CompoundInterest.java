import java.util.Scanner;
class CompoundInterest {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter principle Amount:");
      int principle =sc.nextInt();
    System.out.println("Enter time:");
      int time =sc.nextInt();
    System.out.println("Enter units:");
      double rate =sc.nextDouble();
    double cp=principle*Math.pow(1+(rate/100),time);
    cp=cp-principle;
    System.out.println(cp);         	
    }
}