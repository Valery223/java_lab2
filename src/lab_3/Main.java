package lab_3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Valery","Teslenko",33,4.7f);
        Student student2 = new Student("Misha", "Kibitkin",22,3.5f);
        Student student3 = new Student("Kirill","Archakov",20,4.4f);
        Student student4 = new Student("Albus", "Dumbledore", 115, 5f );
        Student student5 = new Student("Harry", "Potter", 20, 4.1f);

        HashTable<Integer,Student> studentsHash= new HashTable<>();
        //Вставка студентов
        studentsHash.put(2022123,student1);
        studentsHash.put(2022234,student2);
        studentsHash.put(2022567,student3);
        studentsHash.put(1976890,student4);
        studentsHash.put(2022112,student5);

        //Поиск студента с зачеткой 1976890
        System.out.println(studentsHash.get(1976890).firstName +" " + studentsHash.get(1976890).secondName);

        //Удаление студента
        studentsHash.remove(1976890);

        //Проверка удаления
        System.out.println("Если удаление произошло будет null --> " + studentsHash.get(1976890));

    }
}
