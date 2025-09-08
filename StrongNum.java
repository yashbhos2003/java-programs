import java.util.Scanner;
public class StrongNum{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int fact=0,sum=0;
          int val=num;
          while(num>0){
           int rem=num%10;
           int mult=1;
           while(rem>0){
            mult=mult*rem;
            rem--;
           }
           System.out.println(mult);
           sum+=mult;         
           num/=10;
          }              
         System.out.println(sum);
         String msg=(val==sum)? "Number is Strong "
                    : "Number is not Strong";
         System.out.println(msg);
       }

}