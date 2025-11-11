import java.util.*;
class BSAPP{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int arr[]=new int[5];
   
   int skey,left=0,right=(arr.length-1),mid,index=-1;
   System.out.println("Enter values in array:");
   
   for(int i=0;i<arr.length;i++){
   arr[i]=sc.nextInt();
   }
   System.out.println("Enter Search key");
   skey=sc.nextInt();

   while(left<=right){
   mid =left+(right-left)/2;
 
   if(arr[mid]==skey){
    index=mid;
    break;
   }
   if(arr[mid]<skey){
    left=mid+1;
   }else{
    right=mid-1;
   }
 }
 if(index!=-1){
   System.out.println("Element found");
 }else{
   System.out.println("Element not  found");
  }
 }
}
  
  
   
