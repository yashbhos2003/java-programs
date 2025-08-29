import java.util.Scanner;
class Guards{
	public static void main(String []args){
	Scanner sc =new Scanner(System.in);
	 int input =sc.nextInt();
	
	while(input>0){
	 int totalInfluence=sc.nextInt();
	 double totalGuards=sc.nextDouble();
		
	if(totalInfluence>=totalGuards){
	   System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
	input--;
	}	
	}
}