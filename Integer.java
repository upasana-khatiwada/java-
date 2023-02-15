import java.util.Scanner;
public class Integer{
    public static void main(String[] arg)
    {
        //int num;
        System.out.println("Enter your number: ");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        //int result = num*50;
        System.out.println("Your num is " + num*50);

    }
}