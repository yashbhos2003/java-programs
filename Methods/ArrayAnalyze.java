/*Q7. Create an overloaded function analyze() —
Version 1: accepts one array and displays all unique (non-repeating) elements.

Version 2: accepts two arrays and prints all common elements between them.
Input 1: [2, 3, 2, 4, 5] → Output: Unique: 3, 4, 5  
Input 2: [1, 2, 3], [3, 4, 5] → Output: Common: 3
*/
import java.util.Scanner;
class ArrayAnalyze{
         static void analyze(int []a){
             for(int i=0;i<a.length;i++){                
                for(int j=i+1;j<a.length;j++){
                   if(a[i]==a[j]){
                     a[i]=0;
                     a[j]=0;
                   }
                }
             }
            for(int i=0;i<a.length;i++){
               if(a[i]!=0){
                 System.out.print(a[i]+" ");
               }
            }
         }

         static void analyze(int []a,int b[]){
              for(int i=0;i<a.length;i++){
                 for(int j=0;j<b.length;j++){
                    if(a[i]==b[j]){
                      System.out.print(a[i]+" ");
                    }
                 }
              }
         }
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter size of array to analyze unique element in array");
         int size=sc.nextInt();
         int arr[]=new int[size];
         System.out.println("enter element in array");
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         analyze(arr);

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

         analyze(a,b);
     }
}