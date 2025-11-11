/* Date :- 24-09-2025

Q5. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5  */

import java.util.Scanner;
class Array9{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        int newArray[]=new int[size-1];
        
          for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
          }
          int position=sc.nextInt();
          int ind=0;
          for(int i=0; i<size;i++){
             if(i!=position){
             newArray[ind]=arr[i];
             ind++;
           }
         }
         for(int i=0;i<newArray.length;i++){
             System.out.print(newArray[i]+" ");
          }
       sc.close();
     }
}