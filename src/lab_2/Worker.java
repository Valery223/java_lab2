package lab_2;

public abstract class Worker {
    private String fullName;
    private float salary;
    private Data dataStartWork;
    static int counter = 0;

    public Worker(String fullName, float salary, Data dataStartWork){
        this.fullName = fullName;
        this.salary = salary;
        this.dataStartWork = dataStartWork;
        counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public float getSalary() {
        return salary;
    }

    public Data getDataStartWork() {
        return dataStartWork;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDataStartWork(Data dataStartWork) {
        this.dataStartWork = dataStartWork;
    }

    public abstract void salaryIncrease();

    public abstract void salaryIncrease(float coefficient);

    public void print(){
        System.out.println("--------------");
        System.out.println("Full Name: " + getFullName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Hire date " + getDataStartWork());
    }

}
