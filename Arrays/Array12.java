/* Date :- 24-09-2025

Q9.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.  */

import java.util.Scanner;
class Array12{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];

          for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
          }
          
          
          for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
               if(arr[i]==arr[j]){
                 arr[j]=0;
               }
            }
          }
  
           for(int i=0;i<size;i++){
               if(arr[i]!=0){
                 System.out.print(arr[i]+" ");
               }
          }
     }
}