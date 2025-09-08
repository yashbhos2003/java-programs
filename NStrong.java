import java.util.Scanner;
public class NStrong{
          static int factorial(int num){
                int fact=1;
               while(num>0){
                 fact*=num;
                   num--;
               }
            return fact;
          } 
      public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         
         for(int i=1;i<=n;i++){
             int val=i;
             int sum=0;  
           while(val>0){
             int rem=val%10;
             int fact=factorial(rem);
             
             sum+=fact;
             val/=10;
           }
          if(sum==i){
             System.out.println(i);
          }
         }
         
      }
}