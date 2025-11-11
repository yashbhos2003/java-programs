/* Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30  */

import java.util.Scanner;
class Array2{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }

        System.out.print("values at even index:");
        for(int i=0;i<size;i++){
           if(i%2==0){            
              System.out.print(arr[i]+" ");
           }
        }
        System.out.println();

        System.out.print("values at odd index:");
        for(int i=0;i<size;i++){
           if(i%2==1){            
              System.out.print(arr[i]+" ");
           }
        }        
     }
}