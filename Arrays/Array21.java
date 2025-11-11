/*Q3. Q4. Write a program in java to find out the maximum difference between any two elements      such that larger element appears after the smaller number.
	Expected Output :
	The given array is : 7 9 5 6 13 2
	The elements which provide maximum difference is: 5, 13
	The Maximum difference between two elements in the array is: 8

*/

class Array21{
     public static void main(String []args){
         int arr[]=new int[]{7, 9, 5, 6, 13, 2};
         int maxDiff=0;
         int val1=0,val2=0;
             for(int i=0;i<arr.length;i++){
                   int diff=0;
                for(int j=i+1;j<arr.length;j++){
                   if(arr[i]<arr[j]){
                     diff=arr[j]-arr[i];
                   }
                  if(maxDiff<diff ){
                    maxDiff=diff;
                    val1=arr[i];
                    val2=arr[j];
                  }
                                 
                }                
             }
          System.out.println(maxDiff);
          System.out.println(val1 +","+val2);
     }
}