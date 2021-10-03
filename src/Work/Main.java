package Work;

public class Main {
    public static void main(String[] args) {
        HeadDepartment headDepartment = new HeadDepartment();
        System.out.println(headDepartment.toString());
        Workers worker = new Workers("Alex Nord",25,3);
        System.out.println(worker.toString());

    }
}
