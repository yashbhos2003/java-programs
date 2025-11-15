/*Q6. Write an overloaded function compare() —
Version 1: accepts a single integer array and checks if it is symmetric (first element = last element, etc.).


Version 2: accepts two integer arrays and checks whether both arrays are identical (same size and same elements in order).
Input 1: [1, 2, 3, 2, 1] → Output: Symmetric Array
Input 2: [1, 2, 3], [1, 2, 3] → Output: Arrays are identical

*/
import java.util.Scanner;
class ArrayComparison{
         static void compare(int []a){
              if(a[0]==a[a.length-1]){
                System.out.println("symmetric array");
              }
         }

         static void compare(int []a,int b[]){
              if(a.length==b.length){
                  boolean flag=false;
                for(int i=0;i<a.length;i++){
                   if(a[i]!=b[i]){
                      flag=true;
                      break;
                   }
                }

                 if(flag){
                   System.out.println("Arrays are not identical");
                 }else{
                   System.out.println("Arrays are identical");
                 }
              }
         }
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter size of array to compare array is symmetric or not");
         int size=sc.nextInt();
         int arr[]=new int[size];
         System.out.println("enter element in array");
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         compare(arr);

         System.out.println("enter size of first array");
         int size1=sc.nextInt();
         int a[]=new int[size];
         System.out.println("enter element in array");
         for(int i=0;i<arr.length;i++){
            a[i]=sc.nextInt();
         }
         System.out.println("enter size of second array");
         int size2=sc.nextInt();
         int b[]=new int[size];
         System.out.println("enter element in array");
         for(int i=0;i<arr.length;i++){
            b[i]=sc.nextInt();
         }

         compare(a,b);
     }
}