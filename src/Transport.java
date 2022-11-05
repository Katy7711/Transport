import java.util.List;
import java.util.Set;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;
    private final Driver driver;
    private final Set<Mechanic> mechanics;
    private final Set <Sponsor> sponsors;


    public Transport(String brand, String model, double engineVolume, Driver driver, Set<Mechanic> mechanics, Set<Sponsor> sponsors) {
        this.driver = driver;
        this.mechanics = mechanics;
        this.sponsors = sponsors;
        if (brand == null || brand.isEmpty() || brand.isBlank())
            brand = "default";
        this.brand = brand;
        if (model == null || model.isEmpty() || model.isBlank())
            model = "default";
        this.model = model;
        if (engineVolume <= 0)
            engineVolume = 1;
        this.engineVolume = engineVolume;
    }

    public abstract void go ();
    public abstract void stop ();
    public abstract void passDiagnostics();
    public void printPersonInfo () {
        System.out.println("Водитель: " + driver.getFullName());
        for (Sponsor sponsor: sponsors) {
            System.out.println(sponsor);
            for (Mechanic mechanic: mechanics) {
                System.out.println(mechanic);
            }
        }

    }

//    private final int productionYear;
//    private final String productionCountry;
//    private String color;
//    private int maxSpeed;
//
////
//    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
//        if (brand == null || brand.isEmpty() || brand.isBlank())
//            brand = "default";
//        this.brand = brand;
//        if (model == null || model.isEmpty() || model.isBlank())
//            model = "default";
//        this.model = model;
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;
//        if (color == null || color.isEmpty() || color.isBlank())
//            color = "цвет не указан";
//        this.color = color;
//        if (maxSpeed <= 0)
//            maxSpeed = 100;
//        this.maxSpeed = maxSpeed;
//        }


//    public abstract void refill ();
//

    public String getBrand() {
            return brand;
        }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
            this.model = model;
        }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Driver getDriver() {
        return driver;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }
    //    public int getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", driver=" + driver +
                ", mechanics=" + mechanics +
                ", sponsors=" + sponsors +
                '}';
    }


}
