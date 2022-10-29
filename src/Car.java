import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    private final BodyTape bodyTape;

    public Car(String brand, String model, double engineVolume, BodyTape bodyTape) {
        super(brand, model, engineVolume);
        this.bodyTape = bodyTape;
    }

    public void printType () {
        if (this.bodyTape !=null) {
            System.out.println(bodyTape);
        } else {
            System.out.println("Данных недостаточно");
        }
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s совершил пит-стоп",
                this.getModel(),
                this.getBrand());
    }

    @Override
    public int BestLapTime() {
        return ThreadLocalRandom.current().nextInt(1,1000);
    }

    @Override
    public int MaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,400);
    }

    @Override
    public void go() {
        System.out.printf("Автомобиль %s %s начал движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stop() {
        System.out.printf("Автомобиль %s %s закончил движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new DiagnosticsException ("Автомобиль " + getBrand() + " " + getModel() + " не прошел диагностику");
        }
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                '}';
    }
}


//        public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
//               double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//        if (engineVolume <= 0)
//            engineVolume = 1;
//        this.engineVolume = engineVolume;
//        if (transmission == null || transmission.isEmpty() || transmission.isBlank())
//            transmission = "МКПП";
//        this.transmission = transmission;
//        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank())
//            bodyType = "седан";
//        this.bodyType = bodyType;
//            if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank())
//                registrationNumber = "X000XX000";
//        this.registrationNumber = registrationNumber;
//        NumberOfSeats = Math.max(numberOfSeats, 1);
//            }