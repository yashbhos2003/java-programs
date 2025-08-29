import java.util.Scanner;
public class Palindrome{
       public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
         int num=sc.nextInt();
         int val=num;
         int rem,rev=0;
        while(num>0){ 
             rem=num%10;
             rev=rev*10+rem;  
             num/=10;
       }
        String msg=(val==rev)? "Num is palindrome"
                    :"Not palindrome" ;
        System.out.println(msg);      
       }

}