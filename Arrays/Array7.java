/* Date :- 24-09-2025

Q2. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.  */

import java.util.Scanner;
class Array7{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }
        
          int p1=0;
          int p2=arr.length-1;
          int temp=0;
            while(p2>p1){
              temp=arr[p2];
              arr[p2]=arr[p1];
              arr[p1]=temp;
              p1++;
              p2--; 
            }
          for(int i=0;i<size;i++){
           System.out.print(arr[i]+" ");
        }
        
     }
}