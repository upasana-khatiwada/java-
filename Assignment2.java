import java.util.Scanner;

public class Assignment2{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("\na) Enter the total number of employees: ");
        int employees_num= input.nextInt();

        System.out.println("\n b)Enter the name of supervisior: ");
        input.nextLine();
        String name= input.nextLine();

        System.out.println("\n c)How many times the nuclear waste is removed from the core: ");
        int waste= input.nextInt();

        System.out.println("\n d) what is the Total weight of the waste produced every 1 week: ");
        float weight = input.nextFloat();

        System.out.println("\n e)Is Electric Motor being replaced every 18 days? Press 'y' for yes and 'n' for no: ");
        char choice= input.next().charAt(0);
        System.out.println(choice);

        System.out.println("\n f)What is core average temperature(celcius) of the Nuclear Reactor");
        double degree= input.nextFloat();
        input.nextLine();
        input.nextLine();
        
       

        System.out.println("\nthe status of Nuclear reactor name JX00-XC-HB1 is ");
        System.out.println("\n##########################################################################");
        System.out.println("\nthe total number of employees is "+ employees_num);
        System.out.println("\nthe name of supervisior is  "+ name);
        System.out.println("\nthe neculear waste is removed from the core " + waste +" times");
        System.out.println("\nTotal weight of the waste produced every 1 week is "+weight);
        System.out.println("\n Is Electric Motor being replaced every 18 days? "+ choice);
        System.out.println("the core average temperature(celcius) of the Nuclear Reactor is ");
        System.out.println(degree+ "°C in celcius");
        double kelvin= degree + 273.15;
        System.out.println(kelvin+ "K in Kelvin\n\n");


    }
}