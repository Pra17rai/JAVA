import java.util.Scanner;
public class Nuclear{
    public static void main(String[] args)
    {
        System.out.println("\n\n\t\t\tPROJECT NUCLEAR REACTOR");
        Scanner object = new Scanner(System.in);
        System.out.println("What is the name of supervisor: ");
        String name = object.nextLine();
        System.out.println("Enter the total number of employee: ");
        int num=object.nextInt();
        System.out.println("How many times the Nuclear waste is removed from the core: ");
        int waste_no = object.nextInt();
        System.out.println("Enter the total weight of waste produced every 1 week [in tons]: ");
        float total_waste = object.nextFloat();
        System.out.println("Is electric motor being replaced every 18 days [Press 'y' for yes and 'n' for no?]");
        char motor_update = object.next().charAt(0);
        System.out.println("What is the core average temperature [Celcius] of the Nuclear reactor: ");
        float temp = object.nextFloat();
        System.out.println("\n\t\t\tDETAILS ARE:\n\tThe total number of employee is  "+num+" .");
        System.out.println("\n\tThe name of supervisor is "+name+" .");
        System.out.println("\n\tThe nuclear waste is removed "+waste_no+" times from the core.");
        System.out.println("\n\tThe total waste produced every week is "+total_waste+" tons.");
        if(motor_update == 'y')
        {
            System.out.println("\n\t'YES' the electric motor is being replaced every 18 days.");
        }
        else if(motor_update == 'n')
        {
            System.out.println("\n\t'No' the electric motor isnot being replaced in every 18 days. ");
        }
        else{
            System.out.println("\n\tINVALID INPUT");
        }
        System.out.println("\n\tThe average core temperature of the Nuclear reactor [Celcius] is "+temp+ " C and [Kelvin] is "+temp+273.15+" K");

    }
}