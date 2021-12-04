package com.company;
import java.util.Random;

public class Main {

    public static String method(int age, int temp) {

        if ((age < 45 && age > 20) && (temp > -20 && temp < 30)) {
            return "Можно идти гулять";
        }
        else if ((age < 20) && (temp > 0 && temp < 28)) {
            return "Можно идти гулять";
        }
        else if ((age > 45) || (temp > -10 && temp < 25)){
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt();
        return age;
    }

    public static void main(String[] args) {
        System.out.println(method(generateRandomAge(),11));
        System.out.println(method(generateRandomAge(),-30));
        System.out.println(method(generateRandomAge(),6));
        System.out.println(method(generateRandomAge(),-20));
        System.out.println(method(generateRandomAge(),40));
    }
}
