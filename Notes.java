import java.util.Scanner;
class Notes{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int amount=sc.nextInt(); 

    int n500=amount/500;
    amount=amount%500;

    int n100=amount/100;
    amount=amount%100;
 
    int n50=amount/50;
    amount=amount%50;

    int n20=amount/20;
    amount=amount%20;

    int n10=amount/10;
    amount=amount%10;

    int n5=amount/5;
    amount=amount%5;

    int n2=amount/2;
    amount=amount%2;

    int n1=amount;

    System.out.println("500= "+n500 + " 100= "+n100 + " 50= "+n50+ " 10= "+n10+ " 20= "+n20+ " 10= "+n10+ " 5= "+n5+ " 2= "+n2+ " 1= "+n1);

   /* int arr[]={500,100,50,20,10,5,2,1};

    for(int i=0;i<arr.length;i++){
       int count=amount/arr[i];
       amount=amount%arr[i];
       System.out.println(arr[i]+" = "+count); 
    }*/
   
    }
}