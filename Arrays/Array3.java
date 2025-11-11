/* Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3  */

import java.util.Scanner;
class Array3{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
   
        int size=sc.nextInt();
        int arr[]=new int[size];
        int evenCount=0,oddCount=0;
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }

        
        for(int i=0;i<size;i++){
           if(arr[i]%2==0){            
              evenCount++;
           }
        }

        for(int i=0;i<size;i++){
           if(i%2==1){            
              oddCount++;
           }
        }

       System.out.println(" Count of Even Values = "+evenCount);
       System.out.println(" Count of odd Values = "+oddCount);        
     }
}