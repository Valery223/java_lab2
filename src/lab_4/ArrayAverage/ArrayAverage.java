package lab_4.ArrayAverage;

import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length;
        do{
            System.out.print("Введите длину массива: ");
            while(!scanner.hasNextInt()){
                System.out.println("Ошибка: Введено неверное значение");
                System.out.print("Введите длину массива: ");
                scanner.next();
            }
            length = scanner.nextInt();
        } while(length <=0);

        double[] nums = new double[length];

        //Заполнение массива
        for(int i = 0; i < length; i++){
            System.out.print("Введите элемент " + (i+1) + ": " );

            try{
                nums[i] = scanner.nextDouble();
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: Введено неверное значение. Введите число.");
                scanner.next();
                i--;
            }
        }
        try{
            nums[nums.length]=45;
            nums[6]=Integer.parseInt("gfd");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Выход за пределы массива");
        }
        catch(NumberFormatException e){

            System.err.println("Ошибка преобразования из строки в число");
        }
        double sum = 0;
        for(double i : nums){
            sum += i;
        }

        double avr = sum / length;
        System.out.println("Среднее арифмитическое равно: " + avr);
    }
}
