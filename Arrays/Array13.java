/* Date :- 24-09-2025

Q10. Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation:
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.  */


import java.util.Scanner;
class Array13{
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