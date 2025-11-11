/* Q2. Write a Java program to count the frequency of each element in an array using a function.
Example Input:
arr = {1, 2, 2, 3, 1, 4, 2}
Output:
1 → 2 times  
2 → 3 times  
3 → 1 time  
4 → 1 time
*/

import java.util.Scanner;
class Method8{
          void frequency(int arr[]){
              for(int i=0;i<arr.length;i++){
                    int count=1;
                  if(arr[i]!=0){
                 for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                       count++;
                       arr[j]=0;
                    }
                 }
               System.out.println(arr[i]+"----->"+count);
               }
              }
          }
     public static void main(String []args){ 
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

       Method8 m=new Method8();
       m.frequency(arr);
       
     }
}