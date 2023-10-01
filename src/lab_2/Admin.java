package lab_2;

public class Admin extends Worker{
    private String rank;
    private int numSubordinates;
    private int hourWork;

    public Admin(String fullName, float salary, Data dataStartWork,String rank,int numSubordinates,int hourWork){
        super(fullName, salary, dataStartWork);
        this.rank = rank;
        this.numSubordinates = numSubordinates;
        this.hourWork = hourWork;

        System.out.println("Создан объект на основе Admin");
    }

    public Admin(String fullName, float salary, Data dataStartWork ) {
        this(fullName, salary, dataStartWork,"10",0,0);
    }


    //geters & seters
    public String getRank() {
        return rank;
    }

    public int getNumSubordinates() {
        return numSubordinates;
    }

    public int getHourWork() {
        return hourWork;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setNumSubordinates(int numSubordinates) {
        this.numSubordinates = numSubordinates;
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }

    @Override
    public void salaryIncrease() {
        float coefficient = 1.1f;
        this.setSalary(this.getSalary() * coefficient);
    }

    @Override
    public void salaryIncrease(float coefficient) {
        this.setSalary(this.getSalary() * coefficient);
    }


    public void promotion(String rank){
        this.rank = rank;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Rank: " + getRank());
        System.out.println("Hour work: " + getHourWork());
        System.out.println("Number of Sumbordinates: " + getNumSubordinates());
    }
}
