import java.util.Scanner;
public class CheckPrime{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int i=2;
          boolean flag=true;        
         while(num%i==0 && i<=num/2){ 
          flag=false;
          i++;
        }
         String str=(flag)? "number is prime"
                    : "number is not prime";
         System.out.println(str);
       }

}