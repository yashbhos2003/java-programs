import java.util.Scanner;
class IQ{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    
      int currentIQ =sc.nextInt(); 
      int einstineIQ=170;	  	
    if(currentIQ+7>=einstineIQ){
	System.out.println("YES");
    }else{
	System.out.println("NO");
    }		
    }
}