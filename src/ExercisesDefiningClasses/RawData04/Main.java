package ExercisesDefiningClasses.RawData04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carModels = Integer.parseInt(scanner.nextLine());

        Set<Car> cars = new LinkedHashSet<>();

        while (carModels-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tire1Pressure = Double.parseDouble(input[5]);
            int tire1Age = Integer.parseInt(input[6]);
            double tire2Pressure = Double.parseDouble(input[7]);
            int tire2Age = Integer.parseInt(input[8]);
            double tire3Pressure = Double.parseDouble(input[9]);
            int tire3Age = Integer.parseInt(input[10]);
            double tire4Pressure = Double.parseDouble(input[11]);
            int tire4Age = Integer.parseInt(input[12]);

            Tire tire;
            List<Tire> tires = new ArrayList<>();

            tire = new Tire(tire1Pressure, tire1Age);
            tires.add(tire);

            tire = new Tire(tire2Pressure, tire2Age);
            tires.add(tire);

            tire = new Tire(tire3Pressure, tire3Age);
            tires.add(tire);

            tire = new Tire(tire4Pressure, tire4Age);
            tires.add(tire);

            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Engine engine = new Engine(engineSpeed, enginePower);
            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String cargoType = scanner.nextLine();

        if (cargoType.equals("fragile")) {
            for (Car car : cars) {
                for (Tire tire : car.getTires()) {
                    if (tire.getPressure() < 1) {
                        System.out.println(car.getModel());
                        break;

                    }
                }
            }

        } else if (cargoType.equals("flamable")) {
            cars
                    .stream()
                    .filter(car -> car.getEngine().getPower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }


    }
}
