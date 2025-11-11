/* Date :- 24-09-2025

Q6. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).  */

import java.util.Scanner;
class Array10{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        
          for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
          }
           int max=0;
             for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                  max=arr[i];
                }
             }
             System.out.println(max);
            int secondMax=0;
           for(int i=0;i<arr.length;i++){
               if(arr[i]<max && secondMax<arr[i]){
                 secondMax=arr[i];
               }
            }
          System.out.println(secondMax);
       sc.close();
     }
}