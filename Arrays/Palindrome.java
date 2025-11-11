import java.util.*;
class Palindrome{
        boolean checkPalindrome(int num){
            int x=num,result=0;
          while(x>0){
             int rem=x%10;
             result=result*10+rem;
             x/=10;
          }
         if(result==num)
           return true;
         return false;
        }
       public static void main(String []args){
           Scanner sc=new Scanner(System.in);
           int x=sc.nextInt();
           Palindrome p=new Palindrome();
            boolean z=p.checkPalindrome(x);
           System.out.println(z);
       }

}