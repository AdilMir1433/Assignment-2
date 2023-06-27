package Classes;

import Classes.Factory.CarFactory;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = CarFactory.getInstance();

        ArrayList<Car> carArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\tPress Q or q to quit");
            System.out.print("Enter CarName : ");
            String carName = scanner.nextLine();
            if (carName.equalsIgnoreCase("q")) break;
            System.out.print("Enter Seat Description : ");
            String seat = scanner.nextLine();
            System.out.print("Enter Engine Description : ");
            String engine = scanner.nextLine();
            System.out.print("Enter Door Description : ");
            String door = scanner.nextLine();
            carArrayList.add(carFactory.makeCar(seat, engine, door,carName));
        }

        if (carArrayList.size() > 0) {
            System.out.println("\n\tCAR INTERFACE");

            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("\nTo View Cars, Press 1\nTo View Car Counts, Press 2\nTo quit, Press 3");
                System.out.print("Enter Your Choice : ");
                int number = scan.nextInt();
                while (number < 1 || number > 3) {
                    System.out.print("Wrong Entry!!\nEnter Again : ");
                    number = scan.nextInt();
                }
                if(number==3) break;

                if (number == 1) {
                    System.out.println("\n----------Cars---------");
                    for (Car car : carArrayList) {
                        System.out.println(car);
                    }
                } else {
                    System.out.println("\n----------Cars Count---------");
                    Map<String, Integer> carCounts = carFactory.getCarCounts();
                    for (Map.Entry<String, Integer> entry : carCounts.entrySet()) {
                        System.out.println(entry.getKey() + "\nCount : " + entry.getValue());
                        System.out.println(" ");
                    }
                }
            }
            scanner.close();
            scan.close();
        }
    }
}