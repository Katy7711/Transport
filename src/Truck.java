import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    private final LoadCapacity loadCapacity;

    public enum LoadCapacity {N1 (0, 3.5),
        N2(3.5, 12),
        N3(12, Double.MAX_VALUE);

        private final double capacityFrom;
        private final double capacityTo;


        LoadCapacity(double capacityFrom, double capacityTo) {
            this.capacityFrom = capacityFrom;
            this.capacityTo = capacityTo;
        }

        public double getCapacityFrom() {
            return capacityFrom;
        }

        public double getCapacityTo() {
            return capacityTo;
        }

        @Override
        public String toString() {
            String capacityFromString = capacityFrom != 0
                    ? "от " + capacityFrom : "";
            String capacityToString = capacityFrom != 0
                    ? "до " + capacityTo + "тонн": "";
            return "Грузоподъемность" + capacityFromString + " " + capacityToString;
        }
    }

    public void printType () {
        if (this.loadCapacity !=null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Данных недостаточно");
        }
    }


    @Override
    public void go() {
        System.out.printf("Грузовик %s %s начал движение",
                this.getModel(),
                this.getBrand());
    }

    @Override
    public void stop() {
        System.out.printf("Автомобиль %s %s закончил движение",
                this.getModel(),
                this.getBrand());
    }

    @Override
    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new DiagnosticsException ("Грузовик " + getBrand() + " " + getModel() + " не прошел диагностику");
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

}
