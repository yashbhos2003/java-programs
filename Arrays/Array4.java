/* 2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30  */

import java.util.Scanner;
class Array4{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }

        
        for(int i=0;i<size;i++){
           sum+=arr[i];
        }

       System.out.println("Sum of array elements = "+sum);        
     }
}