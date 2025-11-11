/*Q1. Write a Java program to find the second largest number in an array using a function.
 Example Input:
 arr = {12, 45, 23, 51, 19, 8}
 Output:
 Second Largest: 45
Explanation:
Sort or traverse the array to find the largest and second largest values.


Function findSecondLargest() scans the array and updates two variables — first and second.*/

import java.util.Scanner;
class Method7{
          int secondLargest(int arr[]){
              int first=arr[0];
              for(int i=0;i<arr.length;i++){
                 if(arr[i]>first){
                   first=arr[i];
                 }
              }
               int secondMax=arr[0];
              for(int i=0;i<arr.length;i++){
                 if(arr[i]<first && arr[i]>secondMax ){
                   secondMax=arr[i];
                 }
              }
              return secondMax;
          }
     public static void main(String []args){ 
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

       Method7 m=new Method7();
       int result=m.secondLargest(arr);
       System.out.println(result);
     }
}