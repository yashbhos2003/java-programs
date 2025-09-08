import java.util.Scanner;
 public class TwoDMatrics{
         static boolean isFind(int arr[][],int x){
              for(int i=0;i<arr.length;i++){
                 for(int j=0;j<arr[i].length;j++){
                     if(arr[i][j]==x){
                       return true;
                     }
                 }
              }
                   return false;
         }
     public static void main(String []args){
         Scanner sc=new Scanner(System.in); 
         int m=sc.nextInt();
         int n=sc.nextInt(); 
         int search=sc.nextInt();  
             int arr[][]=new int[m][n];
             
             for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                   arr[i][j]=sc.nextInt();
                } 
             }

             boolean result=isFind(arr,search);
             System.out.println(result); 
     }
}