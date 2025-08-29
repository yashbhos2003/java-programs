import java.util.Scanner;
class Quadratic{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("input a:");
      int a =sc.nextInt();
    System.out.print("input b:");
      int b =sc.nextInt();
    System.out.print("input c:");
      int c =sc.nextInt();
    System.out.println(); 
    double d=(b*b) - (4*a*c);   

    if(d>0){
       double r1= (-b +Math.sqrt(d)) / (2*a);
       double r2= (-b -Math.sqrt(d)) / (2*a);
       System.out.println("Root1 "+r1); 
       System.out.println("Root2 "+r2);  
    }else if(d==0){
       double e= -b/(2*a);
       System.out.println(e);
    }else{
       System.out.println("Root are imaganary");
    } 	
    }
}