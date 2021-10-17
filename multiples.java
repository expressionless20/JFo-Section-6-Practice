import java.util.Scanner;

public class main{

  public static void main(String []args){
    System.out.print("Choose a Number:");
    Scanner sc = new Scanner(System.in); // Scanner class to get input from user
    int num = sc.nextInt();

    for(int i=1;i<=12;i++)
    {
      System.out.println(num + "*" + i + " = " + num*i);
    }
  } 
}
