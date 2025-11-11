/*Today’s ( 11/09/2025 ) Practical Assignment : 
===========================================================

Q2. Write a java program to print this pattern.

	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1
 */


public class Pattern24{
       public static void main(String []args){

           int row=5;
           int col=5;
           int num=-1; 
         for(int i=1;i<=row;i++){
             if(i<=3){
               num+=2;    
            for(int j=1;j<=col;j++){
                if(j<=num ){
                  System.out.print(num+" ");  
                }               
            }
            
          }else{
               num-=2;
            for(int j=1;j<=col;j++){
                if(j<=num ){
                  System.out.print(num+" ");  
                }               
            }
            
          }
          System.out.println();
         }
       

      }

}