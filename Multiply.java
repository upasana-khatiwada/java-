import java.util.Scanner;
public class Multiply{
    public static void main(String[] arg)
    {
        //int num;
        System.out.println("Enter your number: ");
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        int result = num1*num2;
        System.out.println("Your num is " + result);

    }
}