import java.util.Scanner;
public class DigitProduct{
       public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
         int num=sc.nextInt();
         int product=1;
        while(num>0){ 
           int rem=num%10;
           product*=rem;
           num/=10;
       }
       System.out.println(product);
       }

}