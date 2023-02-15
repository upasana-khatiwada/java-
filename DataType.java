import java.util.Scanner;


public class DataType{
    public static void main(String[] arg)
    {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name= input.nextLine();
        System.out.println("Your name is " + name);
        
    }
}