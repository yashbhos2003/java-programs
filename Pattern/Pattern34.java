/*
Q74. Write a java program to print this pattern.

A
A	B	A
A	B	C	B	A
A	B	C	D	C	B	A
A	B	C	D	E	D	C	B	A
 */


public class Pattern34{
       public static void main(String []args){
             int row=5,col=9,num=1;
             
                for(int i=1;i<=row;i++){
                       char ch='A';
                    for(int j=1;j<=col;j++){
                       if(j<=num){
                          if(j<=i){
                            System.out.print(ch +"  ");
                            if(j<i)
                                ch++;
                          }else{
                             --ch;
                            System.out.print(ch +"  ");
                            
                          } 
                       }
                     } 
                  num+=2; 
                 System.out.println();
                } 
       }
}