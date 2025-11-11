/*
Q71. Write a java program to print this pattern.

				1
			A	B	C
		2	3	4	5	6
	D	E	F	G	H	I	J
7	8	9	10	11	12	13	14	15
 */


public class Pattern31{
       public static void main(String []args){
             int row=5,col=9;
             char ch='A';
             int val=1;
                for(int i=1;i<=row;i++){
                       
                    for(int j=1;j<=col;j++){
                        if(j>=6-i && j<=4+i){
                           if(i%2==1)
                             System.out.print(val++ +"    ");
                           else
                             System.out.print(ch++ +"    ");
                        }else{
                           System.out.print("     ");
                        }
                    }
                 System.out.println();
                } 
       }
}