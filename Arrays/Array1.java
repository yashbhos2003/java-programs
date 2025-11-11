/* Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55  */

import java.util.Scanner;
class Array1{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }

        System.out.print("Even values:");
        for(int i=0;i<size;i++){
           if(arr[i]%2==0){            
              System.out.print(arr[i]+" ");
           }
        }
        System.out.println();

        System.out.print("Odd values:");
        for(int i=0;i<size;i++){
           if(arr[i]%2==1){            
              System.out.print(arr[i]+" ");
           }
        }        
     }
}