/*
Q75. Write a java program to print this pattern.

									A
                                                        1	2	1
                                       A	B	C	B	A
                       1	2	3	4	3	2	1
       A	B	C	D	E	D	C	B	A
 */


public class Pattern32{
       public static void main(String []args){
             int row=5,col=9,val=10;
             
                for(int i=1;i<=row;i++){
                       char ch='A';
                       int num=1;
                       
                    for(int j=1;j<=col;j++){

                       if(j>=val-i){

                          if(i%2==1){
                               if(j<=10-i){
                                 System.out.print(ch +" ");
                                 if(j<10-i){
                                  ch++;
                                }
                              }else{
                                 ch--;
                                 System.out.print(ch +" ");
                              }

                           }else{
                              if(j<=10-i){
                                 System.out.print(num +" ");
                                 if(j<10-i){
                                  num++;
                                }
                              }else{
                                 num--;
                                 System.out.print(num +" ");
                              }
                           } 
 
                       }else{
                         System.out.print("  ");
                       }
                    }
                    val--;
                 System.out.println();
                } 
       }
}