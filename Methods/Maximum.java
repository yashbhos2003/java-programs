/*1.    Find the Maximum Value in an Array
o   Write a class with a method to find and return the maximum value in an integer array.
 Explanation: Learn how to traverse an array and find the largest element using methods.*/

class MaxEle{
     int max(int arr[]){
         int max=arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
             max=arr[i];
           }
        }
        return max;
     }
}

class Maximum{
     public static void main(String []args){
      int arr[]={1,2,3,4,5,6};
      MaxEle m=new MaxEle();
      System.out.println(m.max(arr+));
     }
}