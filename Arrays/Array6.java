/* Date :- 24-09-2025

Q1. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2  */

import java.util.Scanner;
class Array6{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        boolean flag=false;
        int index=0,ele=0;
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
         for(int i=0;i<arr.length;i++){
           if(arr[i]==element){
              index=i;
              ele=arr[i];
              flag=true;
              break;
           }
        }
        String result=(flag)?"Element "+ele+" found at index "+index:"element not found";
        System.out.println(result);
          
     }
}