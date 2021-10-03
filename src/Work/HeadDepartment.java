package Work;

public class HeadDepartment {
    protected final String NAME_OF_DEPARTMENT = "Главный департамент";
    private int amountOfWorkers = 100;

    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }

    private void setAmountOfWorkers(int amountOfWorkers) {
        this.amountOfWorkers = amountOfWorkers;
    }



    @Override
    public String toString() {
        return  NAME_OF_DEPARTMENT  +
                " содержит " + amountOfWorkers +
                " сотрудников.";
    }
}
