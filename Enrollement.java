import java.util.Scanner;
class Enrollement{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    
      int N=sc.nextInt();  //N=group of friends who want to enroll a course 	
      int M=sc.nextInt();  //M=capacity of student	
      int K=sc.nextInt();  //K=student who have already enrolled in class

    if((M-K)<=N){
	System.out.println("YES");
    }else{
	System.out.println("NO");
    }		
    }
}