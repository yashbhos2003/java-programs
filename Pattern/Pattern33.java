/*
Q62. Write a java program to print this pattern.

	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I
 */


public class Pattern33{
       public static void main(String []args){
             int row=5,col=5;
                   char x='A';
                  for(int i=0;i<row;i++){
                       
                     char ch=(char)((int)x+i);  
                    for(int j=1;j<=col;j++){
                       System.out.print(ch++ +" "); 
                    }
                 System.out.println();
                } 
       }
}