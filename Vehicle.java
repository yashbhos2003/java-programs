import java.util.Scanner;
class Vehicle{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    
      int v =sc.nextInt(); //Total number of vehicle (two-wheeler + four-wheeler)=v
      int w =sc.nextInt(); //Total number of wheels = W
      	  	
    for(int i=0;i<=v;i++){
	if((i*4)+((v-i)*2)==w){
	  System.out.println("FW= "+i+"  TW="+(v-i));
	  break;	
	}
    }	
    }
}