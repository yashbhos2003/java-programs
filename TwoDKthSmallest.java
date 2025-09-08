import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
 public class TwoDKthSmallest{
         static Object isFind(int arr[][],int k,int size){
             // int res[]=new int[size];
             // int index=0;
             ArrayList al=new ArrayList();
              for(int i=0;i<arr.length;i++){
                 for(int j=0;j<arr[i].length;j++){
                    // res[index]=arr[i][j];
                    // index++;
                   al.add(arr[i][j]);
                 }
              }
              Collections.sort(al);
              return al.get(k-1);
         }
     public static void main(String []args){
         Scanner sc=new Scanner(System.in); 
         int m=sc.nextInt();
         int n=sc.nextInt(); 
         int k=sc.nextInt();  
             int arr[][]=new int[m][n];
             int size=m*n;
             for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                   arr[i][j]=sc.nextInt();
                } 
             }
               
             Object result=isFind(arr,k,size);
             System.out.println(k+"th Smallest "+result); 
       }
}