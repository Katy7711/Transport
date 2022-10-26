import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
