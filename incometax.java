import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your annual income :");

        float tax = 0;
        float income = sc.nextFloat();
        if (income <= 2.5f) {
            tax = tax + 0;
        }

        else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);

        }

        else if (income > 5f && income <= 10f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);

        }

        else if (income > 10f) {
            tax = tax + 0.05f * (income - 2.5f);
            tax = tax + 0.2f * (income - 5f);
            tax = tax + 0.3f * (income - 10f);

        }

        System.out.println("You have to pay : " + tax);

        sc.close();

    }

}
