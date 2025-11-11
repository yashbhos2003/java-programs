/*Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
*/

import java.util.*;
class Method3{

    void perfect(int n){
         int sum=0;
        for(int i=1;i<=n/2;i++){
           if(n%i==0){
             sum+=i;
           }
        }
        if(n==sum){
          System.out.println("number is perfect");
        }else{
          System.out.println("number is not perfect");
        }
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    Method3 m=new Method3();
    m.perfect(num);
    }
}