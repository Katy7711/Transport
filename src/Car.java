public class Car extends Transport {


    protected double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private final int NumberOfSeats;


    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
               double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (engineVolume <= 0)
            engineVolume = 1.5;
        this.engineVolume = engineVolume;
        if (transmission == null || transmission.isEmpty() || transmission.isBlank())
            transmission = "МКПП";
        this.transmission = transmission;
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank())
            bodyType = "седан";
        this.bodyType = bodyType;
            if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank())
                registrationNumber = "X000XX000";
        this.registrationNumber = registrationNumber;
        NumberOfSeats = Math.max(numberOfSeats, 1);
            }

    @Override
    public void refill() {
        System.out.println("Автомобили можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");

    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", productionCountry='" + getProductionCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxSpeed=" + getMaxSpeed() +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", NumberOfSeats=" + NumberOfSeats +
                '}';
    }
}