package LabSetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ParkingLot01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String direction = command.split(", ")[0];
            String carNumber = command.split(", ")[1];

            if (direction.equals("IN")) {
                parkingLot.add(carNumber);
            } else {
                parkingLot.remove(carNumber);
            }
            command = scanner.nextLine();
        }
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            parkingLot.forEach(System.out::println);
        }

    }
}
