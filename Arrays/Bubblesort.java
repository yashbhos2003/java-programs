import java.util.*;
class Bubblesort{
  public static void main(String[]args){
   
  int arr[]={5,3,6,1,4};
 
  for(int i=0;i<arr.length-1;i++){
    Boolean flag=false;
     
      for(int j=0;j<(arr.length-1)-i;j++){
         if(arr[j]>arr[j+1]){
           int temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
           flag=true;
         }
      }
      if(!flag){
      break;
      }   
   }
   for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
   }
  }
}
  

  