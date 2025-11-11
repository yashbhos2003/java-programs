/*Q2. Write a program in java to find a subarray with given sum from the given array?
		Expected Output :
		The given array is : 3 4 -7 1 3 3 1 -4
		Sum =  7 ;
		[0..1] -- { 3 4 }
		[0..5] -- { 3 4 -7 1 3 3 }
		[3..5] -- { 1 3 3 }
		[4..6] -- { 3 3 1 }*/

class Array19{
     public static void main(String[]args){
         int arr[]={3,4,-7,1,3,3,1,-4};
         
         
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int sum=0;
               for(int k=i;k<=j;k++){
                   sum=sum+arr[k];  
                 // System.out.print(arr[k]+" ");
               }
                if(sum==7){ 
               for(int k=i;k<=j;k++){
                   
                  System.out.print(arr[k]+" ");
               }

               }
             System.out.println();
             
            }
             
         }

                              
     }
}