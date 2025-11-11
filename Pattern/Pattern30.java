/*Q68. Write a java program to print this pattern.
	
	A	1	2	3	4
	A	B	1	2	3
	A	B	C	1	2
	A	B	C	D	1
	A	B	C	D	E
 */


public class Pattern30{
       public static void main(String []args){
             int row=5,col=5;
             
                for(int i=1;i<=row;i++){
                       char ch='A';
                       int val=1;
                    for(int j=1;j<=col;j++){
                       if(j<=i){
                         System.out.print(ch+" ");
                          ch++;
                       }else{
                         System.out.print(val+" ");
                         val++;
                       }
                    }
                 System.out.println();
                } 
       }
}