package Work;

public class Workers extends HeadDepartment{
    private String nameOfWorker;
    private int age;
    private int experience;

    public Workers(String nameOfWorker, int age, int experience) {
        this.nameOfWorker = nameOfWorker;
        this.age = age;
        this.experience = experience;
    }

    public String getNameOfWorker() {
        return nameOfWorker;
    }

    public void setNameOfWorker(String nameOfWorker) {
        this.nameOfWorker = nameOfWorker;
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Сотрудник " + nameOfWorker + '\n'
                +"Возраст: " +  age + '\n'
                + "Место работы: " + NAME_OF_DEPARTMENT + '\n'
                +"Стаж работы (лет): " +  experience + '\n';
    }
}
