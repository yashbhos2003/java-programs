import java.util.Scanner;
public class PerfectNum{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int i=1;
          int sum=0;
          boolean flag=true;        
         while(i<=num/2){ 
          if(num%i==0){
            sum+=i;
          }
          i++;
        }
         String str=(num==sum)? "Number is Perfect"
                    : "Number is not Perfect";
         System.out.println(str);
       }

}