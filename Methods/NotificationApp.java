/*Q5. Scenario:
App sends notifications through SMS or Email.
 Logic for sending notification must be switchable.
Requirement:
Create parent class Notification.
 Create SMSNotification and EmailNotification classes.
 Use parent reference to trigger notification message.
Input : Notification Type: SMS
Message: "Order Confirmed"
Output:SMS Sent: Order Confirmed
Explanation:
Your main code should use:
 Notification n = new SMSNotification();
 Switching to Email should not disturb core logic, giving loose coupling.*/

import java.util.Scanner;
class Notification{
     void message(){
          System.out.println("ORDER CONFIRMED");
     }
}
class SMSNotification extends Notification{
      void message(){
          System.out.println("SMS sent: ORDER CONFIRMED");
     }
}
class EmailNotification extends Notification{
      void message(){
          System.out.println("Email sent: ORDER CONFIRMED");
     }
}

class NotificationApp{
     public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     
     Notification n;
     System.out.println("1:sms");
     System.out.println("2:email");
     String message=sc.next();
      switch(message){
          case "sms":
              n=new SMSNotification();
              n.message();
	      break;
          case "email":
             n=new EmailNotification();
             n.message();
             break;
         default:
             System.out.println("Enter valid input");
      }    
     }
}