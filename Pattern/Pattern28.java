/*Today’s ( 11/09/2025 ) Practical Assignment : 
===========================================================

Q6. Write a java program to print this pattern.

	1
	2	3
	4		5
	6			7
	8	9	10	11	12
 */


public class Pattern28{
       public static void main(String []args){

           int row=5;
           int col=5;
           int num=1;
         for(int i=1;i<=row;i++){   
            for(int j=1;j<=col;j++){
               if(j==1 || i==5 || i==j){
                  System.out.print(num++ +"  ");                            
               }else{
                  System.out.print("   ");
               }  
             }                  
          System.out.println();
         }
      }
}