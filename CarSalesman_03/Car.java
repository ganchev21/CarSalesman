package ObjectsAndClassesMoreExercise.CarSalesman_03;

public class Car {
    private String modelOfCar;
    private String engineModel;
    private String weight;
    private String colour;

    public Car (String model, String engine, String weight, String paint) {
        this.modelOfCar = model;
        this.engineModel = engine;
        this.weight = weight;
        this.colour = paint;
    }

    public String getModel() {
        return this.modelOfCar;
    }

    public String getEngineModel() {
        return this.engineModel;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getColour() {
        return this.colour;
    }
}
