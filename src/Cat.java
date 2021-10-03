public class Cat extends Animal {
    private String name = "Nub";

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Cat can move very slow and quietly");
    }
}
