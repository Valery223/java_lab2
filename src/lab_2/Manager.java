package lab_2;

public class Manager extends Worker {

    private int efficiency;


    public Manager(String fullName, float salary, Data dataStartWork, int efficiency){
        super(fullName, salary, dataStartWork);
        this.efficiency = efficiency;

        System.out.println("Создан объект на основе Manager");
    }
    public Manager(String fullName, float salary, Data dataStartWork) {
        this(fullName, salary, dataStartWork,100);
    }


    //geter & seters


    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public void scold(Worker w){
        System.out.println(getFullName() + " ругает " + w.getFullName() + " за плохую работу");
    }

    @Override
    public void salaryIncrease() {
        float coefficient = 1.5f;
    }

    @Override
    public void salaryIncrease(float coefficient) {
        this.setSalary(this.getSalary() * coefficient);
    }

    public void print(){
        super.print();
        System.out.println("Efficiency: " + getEfficiency());
    }
}
