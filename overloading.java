package OOPS;


class MyEmployee {
    private int id;
    private String name;

    public MyEmployee(String myName,int myId){
        id=myId;
        name=myName;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public void setName(String n){
        name=n;
    }
}

public class overloading {
    public static void main(String[] args) {
        MyEmployee rajneesh = new MyEmployee("Rajneesh",45);
        rajneesh.setName("Rajneesh");
        // rajneesh.setId(34);
        System.out.println("Employee ID: " + rajneesh.getId());
        System.out.println("Employee Name: " + rajneesh.getName());
    }
}
