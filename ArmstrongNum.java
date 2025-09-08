import java.util.Scanner;
public class ArmstrongNum{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int val=num,count=0,sum=0,x=num;
          
          while(val>0){
           val/=10;
           count++;
          } 

         while(num>0){
           int rem=num%10;
           int temp=count,p=1;
           while(temp>0){
            p=rem*p;
            temp--;
           }
          num/=10;
          sum=sum+p;
        }
        System.out.println(sum); 
        String result=(sum==x)? "Number is Armstrong":"Number is not Armstrong";
        System.out.println(result);
       }
}