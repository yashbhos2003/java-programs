/* Date :- 24-09-2025

Q8. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.  */

import java.util.Scanner;
class Array11{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];

          for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
          }
          
          
          for(int i=0;i<size;i++){
            if(arr[i]>0){ 
              System.out.print(arr[i]+" "); 
            }
          }
     }
}