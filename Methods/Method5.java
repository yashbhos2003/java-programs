/*Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
*/

import java.util.*;
class Method5{

    void duck(int n){
        int num=n; boolean flag1=false,flag2=false;
        while(num>0){
          int rem=num%10;
          if(rem==0){
            flag1=true;
          }
          if(flag1 && rem!=0){
            flag2=true;
          }
          num/=10;
        }
       if(flag2){
         System.out.println(n+" is duck number");
       }else{
         System.out.println(n+" is not duck number");
       }
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    Method5 m=new Method5();
    m.duck(num);
    }
}