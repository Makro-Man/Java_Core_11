package ua.lviv.lgs.essence;

import ua.lviv.lgs.arrayinteger.Randomable;

import java.util.Arrays;
import java.util.Scanner;

public class Application implements Randomable {
    public static void main(String[] args) {

        int a = Randomable.getRandomValueFromRange(2, 5);

        int b = Randomable.getRandomValueFromRange(2, 6);

        Car[][] cars = new Car[a][b];

        for (int i = 0; i<a; i++){
            for (int j = 0 ; j<b; j++){
                cars[i][j]= new Car(Randomable.getRandomValueFromRange(2,6), Randomable.getRandomValueFromRange(4,7),
                        new Helm(Randomable.getRandomValueFromRange(4,7),"Alcantara"),
                        new Engine(Randomable.getRandomValueFromRange(3,7)));
            }
        }
        menu();
        Scanner scan = new Scanner(System.in);

        String sc = scan.nextLine();

        switch (sc){
            case "1":
                System.out.println(Arrays.deepToString(cars));
                break;
            case "2":
                Car auto = new Car(100, 1987, new Helm(100, "Alcantara"), new Engine(100));
                for (Car[] autocar : cars){
                    Arrays.fill(autocar, auto);
                    System.out.println(Arrays.deepToString(autocar));
                }
                break;

        }
    }

    static void menu(){
        System.out.println("Натисніть 1, щоб Вивести toString() даних елементів масиву на консоль.");
        System.out.println("Натисніть 2, щоб Для всіх об`єктів даного масиву засетити одинаковий  об`єкт класу Авто");
    }
}
