/*
Q84. Write a java program to print this pattern.


	D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D

 */


public class Pattern35{
       public static void main(String []args){
           int row=7,col=4;
                
               for(int i=1;i<=row;i++){
                  char ch='D';
                  for(int j=1;j<=col;j++){
                    if((j<=i && i<=4) || (i>4 && j<=8-i))
                      System.out.print(ch-- +"  ");
                  }
               System.out.println();
               }                 
       }
}