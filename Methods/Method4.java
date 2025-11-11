/*Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.

*/

import java.util.*;
class Method4{

    void armstrong(int n){
        int a=n,count=0,sum=0,num=n;
        while(a>0){
          count++;
          a/=10;
        }
        
        while(n>0){
         int c=count,pow=1;
         int rem=n%10;
             
           while(c>0){
             pow=pow*rem;
             c--;
           }
           sum+=pow;
           n/=10;
        }
        System.out.println(sum);
        if(num==sum){
          System.out.println("number is armstrong");
        }else{
          System.out.println("number is not armstrong");
        }
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    Method4 m=new Method4();
    m.armstrong(num);
    }
}