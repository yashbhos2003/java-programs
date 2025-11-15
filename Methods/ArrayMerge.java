/*Q8. Overload cleanMerge() —
Version 1: accepts one array, removes duplicates, and prints the cleaned array.


Version 2: accepts two arrays, removes duplicates from both, merges them, and prints the final array in ascending order.
Input 1: [1, 2, 2, 3, 3, 4] → Output: [1, 2, 3, 4]
Input 2: [1, 2, 3], [2, 3, 4] → Output: [1, 2, 3, 4]

*/
import java.util.Scanner;
import java.util.Arrays;
class ArrayMerge{
         static void cleanMerge(int []a){
                int count=0;
             for(int i=0;i<a.length;i++){                
                for(int j=i+1;j<a.length;j++){
                   if(a[i]==a[j]){
                     a[j]=0;
                     count++;
                   }
                }
             }
             int arr[]=new int[a.length-count];
             int j=0;
            for(int i=0;i<a.length;i++){
               
               if(a[i]!=0){
                 arr[j]=a[i];
                 j++;
               }
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
         }

         static void cleanMerge(int []a,int b[]){
              int count=0;
              for(int i=0;i<a.length;i++){
                 for(int j=0;j<b.length;j++){
                    if(a[i]==b[j]){
                      b[j]=0;
                      count++;
                    }
                 }
              }
              int size=a.length+b.length-count;
              int arr[]=new int[size];
              int j=0;
              for(int i=0;i<a.length;i++){
                  if(a[i]!=0){
                     arr[j]=a[i] ;
                     j++;
                  }
               }

               for(int i=0;i<b.length;i++){
                  if(b[i]!=0){
                     arr[j]=b[i];
                     j++;
                   }
               }
              for(int i=0;i<arr.length;i++){
                 System.out.print(arr[i]+" ");
              }
         }
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array to remove duplicate");
         int size=sc.nextInt();
         int arr[]=new int[size];
         System.out.println("enter element in array");
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         cleanMerge(arr);
         
         System.out.println();
         System.out.println("enter size of first array to analyze common element in array ");
         int size1=sc.nextInt();
         int a[]=new int[size1];
         System.out.println("enter element in array");
         for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
         }
         System.out.println("enter size of second array to analyze common element in array");
         int size2=sc.nextInt();
         int b[]=new int[size2];
         System.out.println("enter element in array");
         for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
         }

         cleanMerge(a,b);
     }
}