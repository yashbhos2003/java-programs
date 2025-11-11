/*Today’s ( 11/09/2025 ) Practical Assignment : 
===========================================================

Q1. Write a java program to print this pattern.

					1	
				2	3	2
			3	4	5	4	3
		4	5	6	7	6	5	4
	5	6	7	8	9	8	7	6	5 */


public class Pattern23{
       public static void main(String []args){

           int row=5;
           int col=9;
            
         for(int i=1;i<=row;i++){
                 int num=i;
            for(int j=1;j<=col;j++){
                if(j>=6-i && j<=4+i){
                   if(j<=5){
                      
                     System.out.print(num++ +" ");
                   }else{
                     System.out.print(num-- +" ");
                   }
                }else{
                   System.out.print("  ");
                }
            }
          System.out.println();
         }
       

      }

}