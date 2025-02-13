
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        System.out.println("Your School percentage is out now students :");

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your hindi marks : ");

        Double Hindi= sc.nextDouble();

        System.out.println("Enter your English marks : ");
        Double English= sc.nextDouble();

        System.out.println("Enter your Mamth marks : ");
        Double Math=sc.nextDouble();

        System.out.println("Physics");
        Double Physics = sc.nextDouble();

        System.out.println("Enter your chemistry marks : ");
        Double Chemistry = sc.nextDouble();

        Double TotalMarks=(Hindi + English+ Math+ Physics+ Chemistry);

        System.out.println(TotalMarks);

        Double Percentage=TotalMarks/500*100;
        System.out.println(Percentage);
        sc.close();







        
        
    }
    
}
