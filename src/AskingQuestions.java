import java.util.Scanner;

public class AskingQuestions {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        //Find the average of two double values

        double num1, num2, num3;

        System.out.print("Enter the first number: ");
        num1 = keyboard.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = keyboard.nextDouble();

        num3 = (num1 + num2) / 2;

        System.out.println("The average value is : " + num3);

    }
}
