import java.util.Scanner;
public class SumOfFirstAndLast{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
           int num=sc.nextInt();
           int last=0,first=0;
           last=num%10;
            
           while(num>=10){
            num/=10;
           }
           first=num;  
        System.out.println(first+last);
       }
}