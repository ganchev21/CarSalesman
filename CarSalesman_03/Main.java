package ObjectsAndClassesMoreExercise.CarSalesman_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nEngine = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();

        for (int i = 1; i <= nEngine; i++) {
            String[] engineArr = scanner.nextLine().split("\\s+");
            if (engineArr.length == 4) {
                Engine engine = new Engine(engineArr[0], Integer.parseInt(engineArr[1]),
                        engineArr[2], engineArr[3]);
                engineList.add(engine);

            } else if (engineArr.length == 3) {
                String digit = engineArr[engineArr.length - 1];
                if (digit.charAt(0) >= 48 && digit.charAt(0) <= 57) {
                    Engine engine = new Engine(engineArr[0], Integer.parseInt(engineArr[1]),
                            engineArr[2], "n/a");
                    engineList.add(engine);
                } else {
                    Engine engine = new Engine(engineArr[0], Integer.parseInt(engineArr[1]),
                            "n/a" ,engineArr[2]);
                    engineList.add(engine);
                }

            } else if (engineArr.length == 2) {
                Engine engine = new Engine(engineArr[0], Integer.parseInt(engineArr[1]), "n/a"
                        ,"n/a");
                engineList.add(engine);
            }
        }
        int nCars = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 1; i <= nCars ; i++) {
            String[] carsArr = scanner.nextLine().split("\\s+");
            if (carsArr.length == 4) {
                Car car = new Car(carsArr[0], carsArr[1], carsArr[2], carsArr[3]);
                carList.add(car);
            } else if (carsArr.length == 3) {
                String digit = carsArr[carsArr.length - 1];
                if (digit.charAt(0) >= 48 && digit.charAt(0) <= 57) {
                    Car car = new Car(carsArr[0], carsArr[1], carsArr[2], "n/a");
                    carList.add(car);
                } else {
                    Car car = new Car(carsArr[0], carsArr[1], "n/a", carsArr[2]);
                    carList.add(car);
                }
            } else if (carsArr.length == 2) {
                Car car = new Car(carsArr[0], carsArr[1], "n/a", "n/a");
                carList.add(car);
            }
        }
        for (int i = 0; i < carList.size(); i++) {
            String engineModel = carList.get(i).getEngineModel();
            for (int j = 0; j < engineList.size(); j++) {
                if (engineModel.equals(engineList.get(j).getModel())) {
                    System.out.printf("%s:%n  %s:%n   Power: %d%n   Displacement: %s%n   Efficiency: %s%n  Weight: %s%n  Color: %s%n", carList.get(i).getModel(),
                            engineList.get(j).getModel(), engineList.get(j).getPower(),
                            engineList.get(j).getDisplacement(), engineList.get(j).getEfficiency(),
                            carList.get(i).getWeight(), carList.get(i).getColour());
                }
            }
        }
    }
}
