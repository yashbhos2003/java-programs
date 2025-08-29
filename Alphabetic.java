import java.util.Scanner;
class Alphabetic{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    char ch=sc.nextLine().charAt(0); 
    
    // for(int i=0;i<=127;i++){
    //   System.out.println(i+" = "+(char)i);
    // }

     if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z'))
        System.out.println(ch+" is alphabetic");
     else if(ch>=48 && ch<=57)
        System.out.println(ch+"is digit");
     else
         System.out.println(ch+"is specialCharacter");
     }
}