import java.util.Scanner;
class VolumeCount{
	public static void main(String []args){
	Scanner sc =new Scanner(System.in);
	int input=sc.nextInt();
	
	while(input>0){
	 int initialVolume=sc.nextInt();
	 int changeVolume=sc.nextInt();
	 int buttonPressed=0;	
	if(initialVolume>changeVolume){
	   buttonPressed=initialVolume-changeVolume;
	   System.out.println(buttonPressed);
	}else if(initialVolume<changeVolume){
	    buttonPressed=changeVolume-initialVolume; 	
	    System.out.println(buttonPressed);
	}else{
	    System.out.println(initialVolume);
	}
	input--;	
	}
	}
}