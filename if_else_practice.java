import java.util.Scanner;

public class if_else_practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your physics marks : ");
        byte Physics = sc.nextByte();
        System.out.println("Enter your chemistry marks");
        byte Chemistry = sc.nextByte();
        System.out.println("Enter your math marks");
        byte Math = sc.nextByte();

        System.out.println("Your Total Marks ");

        float total = (Physics + Math + Chemistry);
        System.out.println(total);

        float avg = total / 3.0f;
        System.out.println(avg);

        String name = " Rajneesh ";

        if (avg >= 40 && Physics >= 33 && Chemistry >= 33 && Math >= 33) {

            System.out.println("Congratulation, " + name + " You are pass");
        } else {
            System.out.println("Soryy you have failed");
        }

        sc.close();

    }
}
