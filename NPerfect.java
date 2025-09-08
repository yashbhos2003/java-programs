import java.util.Scanner;
public class NPerfect{
      public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int count=1;
         int num=2;
         while(count<=n){
            int sum=0;
           for(int i=1;i<=num/2;i++){
             if(num%i==0){
               sum=sum+i;
             } 
           }
          if(sum==num){
          System.out.println(num);
          }
          num++;
          count++;
         }
      }
}