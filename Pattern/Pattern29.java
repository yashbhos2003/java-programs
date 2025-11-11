/*Today’s ( 11/09/2025 ) Practical Assignment : 
===========================================================

Q10. Write a java program to print this pattern.

	1	1	1	1	1	1	1
		2	2	2	2	2	
			3	3	3	
				4
			5	5	5
		6	6	6	6	6
	7	7	7	7	7	7	7
 */


public class Pattern29{
       public static void main(String []args){

           int row=7;
           int col=7;
         for(int i=1;i<=row;i++){   
            for(int j=1;j<=col;j++){
               if((j>=i && j<=8-i && i<=4) || (i>4 && j>=8-i && j<=i)){
                  System.out.print(i+"  ");                            
               }else{
                  System.out.print("   ");
               }  
             }                  
          System.out.println();
         }
      }
}