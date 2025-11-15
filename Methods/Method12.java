/*Q7. Write a program in java to insert an element at desired position from an array.
	Test Data :
	Input the size of array : 6
	Input 5 elements in the array in ascending order :
	1   2    3    4    5	
	Input the position where to insert : 2
	Value :      200
	Expected Output : The new list is : 1 2 200 3 4 5*/

import java.util.Scanner;
class Method12{
     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[];
       arr=new int[size]; 
       for( int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
       }
       Method12 m =new Method12();
       int []c= m.b(arr,2,200);
       for(int i=0;i<c.length;i++){
          System.out.print(c[i]+" ");
       }     
     }

    int []b(int arr[],int pos,int value){
        int a[]=new int[arr.length+1];
        for(int i=0,j=0;i<arr.length;i++){
           if(j!=pos){
             a[j]=arr[i];
           }else{
             a[j]=value;
             i--;
           } 
          j++;         
        }
       return a;
    }
}