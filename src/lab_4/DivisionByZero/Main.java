package lab_4.DivisionByZero;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        try{
            int a = 11;
            int b = 0;
            int resul = division(a,b);
            System.out.println("result: " + resul);
        }
        catch (CustomDivisionException e){
            System.err.println("Произошла ошибка: " + e.getMessage());
            logExeption(e);
        }
    }

    private static void logExeption(CustomDivisionException e) {
        String fileName = "D:\\institute\\java\\lab_2\\lab_2\\src\\lab_4\\DivisionByZero\\logExeption.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Исключение: " + e.getClass().getName());
            printWriter.println("Сообщение: " + e.getMessage());
            printWriter.println("Стек вызовов:");
            e.printStackTrace(printWriter);
            printWriter.println("------------------------");
            printWriter.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static int division(int a, int b) throws CustomDivisionException {
        if(b == 0) throw new CustomDivisionException("Division by zero! a/0");
        return a / b;
    }
}
