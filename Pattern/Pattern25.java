/*Today’s ( 11/09/2025 ) Practical Assignment : 
===========================================================

Q3. Write a java program to print this pattern.

	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1
 */


public class Pattern25{
       public static void main(String []args){

           int row=5;
           int col=5;
           int num=1;
         for(int i=1;i<=row;i++){
                 
            for(int j=1;j<=col;j++){
                System.out.print(num++ +" ");
                if(num>8){
                  num=1;  
                }              
            }                   
          System.out.println();
         }
      }
}