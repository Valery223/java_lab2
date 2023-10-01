package lab_2;
public class Main {
    public static void main(String[] args) {
        Data d1 = new Data(2023,10,1);
        Data d2 = new Data(2020,8,3);
        Data d3 = new Data(2018,4,24);
        String fullName1 = "Valery Teslenko";
        String fullName2 = "Georgi Bolotoshvily";
        String fullName3 = "Nikita Berezov";

        //Admin
        Admin valera = new Admin(fullName1,1500,d3,"good worker",2,200);
        valera.print();

        System.out.println();

        //Programmer
        Programmer nikira = new Programmer(fullName3,50000,d2);
        nikira.print();
        System.out.println();
        nikira.drinkCoffe();
        System.out.println();

        //Manager
        Manager georgi = new Manager(fullName2,100000,d1);
        georgi.print();
        System.out.println();
        georgi.scold(valera);
        System.out.println();

        // Проверка счетчика
        System.out.println("Всего объектов на основе дочерних классу Worker создано: " + Manager.counter);


    }
}