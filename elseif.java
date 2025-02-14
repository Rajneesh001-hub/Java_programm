import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");

        int age;
        age = sc.nextInt();
        if (age > 80) {
            System.out.println("You are old man");
        } else if (age > 60) {
            System.out.println("You are semi old man");
        }

        else if (age > 30) {
            System.out.println("You are young man");
        } else if (age > 20) {
            System.out.println("You are semi young man");
        }

        else {
            System.out.println("You are a child");
        }


        sc.close();

    }

}
