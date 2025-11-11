/* Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50  */

import java.util.Scanner;
class Array5{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }

        
        for(int i=0;i<size;i++){
           System.out.print(arr[i]+" ");     
        }
       System.out.println();   
     }
}