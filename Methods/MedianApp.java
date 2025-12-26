/*Q18.Median of two Sorted Arrays of Different Sizes
Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays.
Assume that the two sorted arrays are merged and then median is selected from the combined
array.
 
Examples: 
Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4, 10]
Output: 3
Explanation: The merged array is [-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15]. 
So the median of the merged array is 3.
Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45, 60]
Output: The median is 11.
Explanation : The merged array is [1, 2, 12, 13, 15, 17, 26, 30, 38, 45, 60]. 
So the median of the merged array is 17.

Input: a[] = [], b[] = [2, 4, 5, 6]
Output: The median is 4.5
Explanation: The merged array is [2, 4, 5, 6]. The total number of elements are even,
 so there are two middle elements. Take the average between the two: (4 + 5) / 2 = 4.5
Your Task : you have to create class name as Median with constructor and some methods
given below 
Median(int a[],int b[]): this constructor help us to accept two array as parameter 
float getMedian(): this function can find the median of an array and return its result.
*/


class Median{
      int a[];
      int b[];
      Median(int a[],int b[]){
       this.a=a;
       this.b=b;
      }

      float getMedian(){
           int c[]=new int[a.length+b.length]; 
           int k=0;
           for(int i=0;i<a.length;i++){
              c[k++]=a[i];
           }

           for(int i=0;i<b.length;i++){
              c[k++]=b[i];
           }
           
           int x[]=sort(c);
           /*for(int i=0;i<x.length;i++){
              System.out.println(x[i]);
           }*/

           int start=0;
           int end=x.length-1;
           if(x.length%2==0){
             int mid=(start+end)/2;

             float res=((float)(x[mid]+x[mid+1]))/2;
             return res;
           }else{
               int mid=(start+end)/2;
               return x[mid];
           }
           
        }

        int []sort(int arr[]){
             for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1;j++){
                   if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                   }
                }
             }
             return arr;
        }
 }

public class MedianApp{
      public static void main(String [] args){
            int arr1[]={-5, 3, 6, 12, 15};
            int arr2[]={-12, -10, -6, -3, 4, 10};
            Median m =new Median(arr1,arr2);
            
            System.out.println(m.getMedian());
      }
}