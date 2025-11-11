/*Q29. Write a java program to display 1 to nth Prime Number.*/

import java.util.*;
class Method2{

    void prime(int range){
        for(int i=1;i<=range;i++){
           int num=i;
           boolean flag=false;
           for(int j=2;j<=num/2;j++){
              if(num%j==0){
                flag=true;
                break;
              }
           }
           if(!flag){
             System.out.println(i+" ");
           }
        }
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Method2 m=new Method2();
    m.prime(n);
    }
}