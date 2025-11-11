/*
Q81. Write a java program to print this pattern.

A	B	C	D	E	D	C	B	A
A								A
A								A
A								A
A								A

 */


public class Pattern36{
       public static void main(String []args){
           int row=5,col=9;
                
               for(int i=1;i<=row;i++){
                  char ch='A';
                  for(int j=1;j<=col;j++){
                   if(j==1 || j==9 || i==1){
                     if(j<=5){
                      System.out.print(ch +"  ");
                       if(j<5){
                         ch++;
                       }
                     }else{
                      --ch;
                       System.out.print(ch +"  ");
                     }
                   }else{ 
                      System.out.print("   ");
                   } 
                  }
               System.out.println();
               }                 
       }
}