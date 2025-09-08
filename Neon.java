import java.util.Scanner;
public class Neon{
     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int sum=0;
       int sq=num*num;
      // System.out.println(sq);
        for(int i=sq;i>0;i/=10){
            int rem=i%10;
            sum=sum+rem;
        } 
      // System.out.println(sum); 
      String msg=(num==sum)? "Number is neon": "Number is not neon";
      System.out.println(msg);
     }
}