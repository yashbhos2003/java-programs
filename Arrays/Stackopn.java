import java.util.*;
class Stackopn{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    int top=-1;
    do{
    System.out.println("1:PUSH");
    System.out.println("2:POP");
    System.out.println("3:DISPLAY");
    System.out.println("4:PEEK");
    System.out.println("5:SEARCH");
    System.out.println("6:EXIT");
    System.out.println("Enter your choice");
    
   int choice=sc.nextInt();
   switch(choice){
    case 1:
       if(top==(arr.length-1)){
       System.out.println("Stack is overflow");
       }else{
        top=top+1;
        int value=sc.nextInt();
        arr[top]=value;
        System.out.println("Element added in stack");
       }
      break;

    case 2:
       if(top==-1){
       System.out.println("Stack is underflow");
       }else{    
         int value=arr[top];
         System.out.println("Deleted value is" + value);
         top=top-1;
       }
       break;
   
    case 3:
      if(top==-1){
       System.out.println("Stack is underflow");
       }else{
         for(int i=top;i>=0;i--){
          System.out.print(arr[i] + " ");
        }
       }
      break;
   
    case 4:
       if(top==-1){
       System.out.println("Stack is underflow");
       }else{
        int value=arr[top];
        System.out.println("Top most element is:" +value);
       }
      break;

    case 5:
      System.out.println("Enter value for search:");
      int value=sc.nextInt();
      int index=-1;
      for(int i=0;i<=top;i++){
      if(value==arr[i]){
          index=i;
          break;
        }
      }
     if(index!=-1){
     index=top-index;
      System.out.println("Value from top" +index);
     }else{
      System.out.println("Element not found");
    }
    break;
  
   case 6:
    System.exit(0);
    break;
  
   default:
     System.out.println("Wrong choice");
     }
    }while(true);
    
  }
}
    




      
      

       

 
    