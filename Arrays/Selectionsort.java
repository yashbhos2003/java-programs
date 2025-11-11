import java.util.*;
class Selectionsort{
  public static void main(String[]args){
  int arr[]=new int[5];
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
  }

  System.out.println("Before Swapping:");

  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
  }

  for(int i=0;i<arr.length;i++){
      
     for(int j=(i+1);j<arr.length;j++){
         
          if(arr[i]>arr[j]){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
            }
         }
     }
  System.out.println();
  System.out.println("After Swapping:");
  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
  }
 }
}