package laba_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFinder {
    public static void main(String[] args){
        String text = "Tese was founded in 1920 , but it wwaq 12.02.03 ddsa 12.112";
        //numbers
        findNumber(text);

        //password
        String password1 = "vAlera8qw";
        String password2 = "valeraqw";
        checkPassword(password1);
        checkPassword(password2);

        //IP
        String ip1 = "123.124.143.211";
        String ip2 = "123.266.111.111";
        ipAdress(ip1);
        ipAdress(ip2);



    }

    public static void findNumber(String text){
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Найдено: " + matcher.group());
        }
    }

    public static void checkPassword(String password){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}");
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches()){
            System.out.println("Password good");
        }
        else{
            System.out.println("Password not good");
        }

    }

    public static void ipAdress(String ip){
        Pattern pattern = Pattern.compile("^(([2][0-5][0-5]|[0-1][0-9][0-9])\\.){3}(([2][0-5][0-5]|[0-1][0-9][0-9]))$");
        Matcher matcher = pattern.matcher(ip);

        if(matcher.matches()){
            System.out.println("IP correct");
        }
        else{
            System.out.println("IP not correct");
        }
    }
}
