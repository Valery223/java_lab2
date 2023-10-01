package lab_2;

public class Programmer extends Worker{
    private String progLanguage;
    private String currentProject;



    public Programmer(String fullName, float salary, Data dataStartWork, String progLanguage, String currentProject){
        super(fullName, salary, dataStartWork);
        this.progLanguage = progLanguage;
        this.currentProject = currentProject;
        System.out.println("Создан объект на основе Programmer");
    }

    public Programmer(String fullName, float salary, Data dataStartWork) {
        this(fullName, salary, dataStartWork,"java","slacker");
    }

    //geter & seters


    public String getProgLanguage() {
        return progLanguage;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    public void setProgLanguage(String progLanguage) {
        this.progLanguage = progLanguage;
    }

    @Override
    public void salaryIncrease() {
        float coefficient = 1.3f;
        this.setSalary(this.getSalary() * coefficient);
    }

    @Override
    public void salaryIncrease(float coefficient) {
        this.setSalary(this.getSalary() * coefficient);
    }

    public void drinkCoffe(){
        System.out.println(getFullName() + " ушел пить кофе. Будет через час");
    }

    public void print(){
        super.print();
        System.out.println("Programm language: " + getProgLanguage());
        System.out.println("Current project: " + getCurrentProject());
    }
}
