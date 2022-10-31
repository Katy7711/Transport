import com.sun.jdi.connect.Transport;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing  {

    private final CapacityType capacityType;

    public Bus(String brand, String model, double engineVolume, CapacityType capacityType, DriverD driverD, List<Mechanic> mechanics, List<Sponsor> sponsors) {
        super(brand, model, engineVolume, driverD, mechanics, sponsors);
        this.capacityType = capacityType;
    }


    @Override
    public String name() {
        return null;
    }

    public enum CapacityType {EXTRA_SMALL (0,10),
        SMALL(10,25),
        MEDIUM(40,50),
        LARGE(60,80),
        ESPECIALLY_LARGE(100,120);

        private final double capacityFrom;
        private final double capacityTo;

        CapacityType(double capacityFrom, double capacityTo) {
            this.capacityFrom = capacityFrom;
            this.capacityTo = capacityTo;
        }

        public double getCapacityFrom() {
            return capacityFrom;
        }

        public double getCapacityTo() {
            return capacityTo;
        }
        public String toString() {
            String capacity = capacityFrom > 0
                    ? capacityFrom + " - " + capacityTo :
            String.valueOf(capacityTo);
            return "Вместимость:" + capacity + "мест";
        }
    };

    public void printType () {
        if (this.capacityType !=null) {
            System.out.println(capacityType);
        } else {
            System.out.println("Данных недостаточно");
        }
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s совершил пит-стоп",
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
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается");

    }
}
