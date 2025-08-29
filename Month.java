import java.util.Scanner;
class Month{
     public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a week number(1-12)"); 
       int monthNum=sc.nextInt();
     
     switch(monthNum){
       case 1:
          System.out.println("31");
          break;
       case 2:
          System.out.println("30");
          break;
       case 3:
          System.out.println("31");
          break;
       case 4:
          System.out.println("30");
          break;
       case 5:
          System.out.println("31");
          break;
       case 6:
          System.out.println("30");
          break;
      case 7:
          System.out.println("31");
          break;
      case 8:
          System.out.println("31");
          break;
      case 9:
          System.out.println("30");
          break;
     case 10:
          System.out.println("31");
          break;
     case 11:
          System.out.println("30");
          break;
     case 12:
          System.out.println("31");
          break; 
     }
     }
}