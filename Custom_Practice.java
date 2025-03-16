package OOPS;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String Rajneesh) {
        name = Rajneesh;
    }

}

// Problem 2
class CellPhone {
    public void Ring() {
        System.out.println("Ring Ring Toon Toon");

    }

    public void Vibrate() {
        System.out.println("Vib Vib Vib Vib Vib");
    }

    public void Call() {
        System.out.println("Calling my friend...");
    }

}

// Problem 3
class Rectangle {
    int length;
    int breadth;

    public int Perimeter() {
        return 2 * (length + breadth);
    }

    public int Area() {
        return length * breadth;

    }

}
// problem 4
class Tommy{
    public void Fire(){
        System.out.println("Firing.........on the enemy");
    }
    public void Run(){
        System.out.println("Running away from the enemy");
    }
    public void Hit(){
        System.out.println("Hit the enemy");
    }
}

public class Custom_Practice {
    public static void main(String[] args) {
        Employee Rajneesh = new Employee();

        Rajneesh.setName("Rajneesh Yadav");

        Rajneesh.salary = 6500;
        Rajneesh.name = "Rajneesh Yadav";

        System.out.println(Rajneesh.getName());
        System.out.println(Rajneesh.getSalary());

        // problem 2
        CellPhone vivo = new CellPhone();
        vivo.Call();
        vivo.Ring();
        vivo.Vibrate();

        // problem 3
        Rectangle rectangle = new Rectangle();
        rectangle.length = 13;
        rectangle.breadth = 5;
        System.out.println("Perimeter of a rectangle " + 2 * (rectangle.length + rectangle.breadth));
        System.out.println("Area of a rectangle " + rectangle.length * rectangle.breadth);


        // problem4
        Tommy game=new Tommy();
        game.Fire();
        game.Run();
        game.Hit();

    }

}
