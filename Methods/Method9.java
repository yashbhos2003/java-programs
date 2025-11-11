/*Q3. Write a Java program to reverse an array using a function.
Example Input:
arr = {5, 10, 15, 20, 25}
Output:
Reversed Array: 25 20 15 10 5

*/

import java.util.Scanner;
class Method9{
          int []a(int arr[]){
             if(arr.length%2==0){
              for(int i=0;i<arr.length/2;i++){
                 int temp=arr[i];
                 arr[i]=arr[arr.length-1-i];
                 arr[arr.length-1-i]=temp;
              }
             return arr;
            }else{
              for(int i=0;i<=arr.length/2;i++){
                 int temp=arr[i];
                 arr[i]=arr[arr.length-1-i];
                 arr[arr.length-1-i]=temp;
              }
             return arr;
            }
          }
     public static void main(String []args){ 
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

       Method9 m=new Method9();
       int x[]=m.a(arr);
       for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" " );
        }   
       
     }
}