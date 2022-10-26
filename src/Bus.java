import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
}
