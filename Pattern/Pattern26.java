/*Today’s ( 11/09/2025 ) Practical Assignment : 
===========================================================

Q4. Write a java program to print this pattern.

        1	2	3       4       5    
	2	2	3	4	5
	3	3	3	4	5
	4	4	4	4	5
	5	5	5	5	5
 */


public class Pattern26{
       public static void main(String []args){

           int row=5;
           int col=5;
           
         for(int i=1;i<=row;i++){
              int num=i;   
            for(int j=1;j<=col;j++){
                System.out.print(num +" ");
                if(j<i){
                   
                }else{
                  num++;
               }                             
            }                   
          System.out.println();
         }
      }
}