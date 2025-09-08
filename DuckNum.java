import java.util.Scanner;
public class DuckNum{
       public static void main(String []args){
         Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          boolean flag=false;              
         while(num>0){ 
         int rem=num%10;
         if(rem==0){
           flag=true;
         }
         num/=10;
         }
         String str=(flag)? "Number is Duck"
                    : "Number is not Duck";
         System.out.println(str);
       }

}