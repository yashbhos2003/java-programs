/* Date :- 24-09-2025

Q4. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.  */

import java.util.Scanner;
class Array8{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        int copyArray[]=new int[size];
          for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
          }
        
                for(int i=0;i<size;i++){
                 copyArray[i]=arr[i];
                }

                  for(int i=0;i<size;i++){
                    System.out.print(copyArray[i]+" ");
                  }
        
     }
}