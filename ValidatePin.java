import java.util.Scanner;

public class main{

  public static void main(String []args){
    int ValidPin = 1673;
    System.out.println("Please Enter PIN");
    Scanner sc = new Scanner(System.in); 
    int pin = sc.nextInt(); 
    while(pin != ValidPin) 
    {
      System.out.println("Please Enter valid PIN");
      pin = sc.nextInt();
    }

    System.out.println("You entered correct PIN. Now you can access your account.");
  }
}
