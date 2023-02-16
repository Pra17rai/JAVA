import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        Scanner input =new Scanner (System.in);
        System.out.println("My name is Pranam Rai");
        System.out.println("Enter two numbers: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("The sum of two numbers is: ",a+b);
        input.close();
        

    }
}