public class ToStr {
    private String name ;
    private int age;

    @Override
    public String toString() {
        return "Cat " + name + " already " + age + ". It's owner " + owner + " care about it.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String owner ;

    public ToStr(String name,int age,String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public static void main(String[] args) {
        ToStr str = new ToStr("Barsik",5,"Alex");
        System.out.println(str.toString());
    }
}
