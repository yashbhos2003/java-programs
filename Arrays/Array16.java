/* Date :- 24-09-2025


Q7. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :                                           200

	Expected Output : The new list is : 1 2 200 3 4 5
  */


import java.util.Scanner;
class Array16{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        int newArray[]=new int[size+1];
        
          for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
          }
          int position=sc.nextInt();
          int value=sc.nextInt();
          for(int i=0; i<newArray.length;i++){
             if(i<position){
               newArray[i]=arr[i];           
             }
             else if(i==position){
               newArray[i]=value;
             }
             else{
               newArray[i]=arr[i-1];
             }
         }
         for(int i=0;i<newArray.length;i++){
             System.out.print(newArray[i]+" ");
          }
       sc.close();
     }
}