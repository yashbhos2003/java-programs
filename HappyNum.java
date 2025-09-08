import java.util.Scanner;
public class HappyNum{
     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int sum=0,sq=1;

       for(int j=num;j>0;j++){            
         for(int i=num;i>0;i/=10){
            int rem=i%10;
            sq=rem*rem;
            sum=sum+sq;
         }
        System.out.println(sum);
        num=sum;
        sq=1;sum=0;  
        if(num==1){
          System.out.println("Number is happy");
          break;
          }else if(num==4){
           System.out.println("Number is not happy");
           break;
          }       
       }
     }
}